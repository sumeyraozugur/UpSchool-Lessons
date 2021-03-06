package com.sum.roomdatabase

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

@Database(entities = [SleepNight::class], version = 1, exportSchema = false )
abstract class SleepDatabase: RoomDatabase() {

    abstract fun sleepDatabaseDao(): SleepDatabaseDao

    companion object {
        @Volatile
        private var INSTANCE: SleepDatabase? = null

        fun getInstance(context: Context, scope: CoroutineScope): SleepDatabase {
            synchronized(this) {
                var instance = INSTANCE
                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        SleepDatabase::class.java,
                        "sleep_history_database"
                    )
                        .fallbackToDestructiveMigration()
                        .addCallback(SleepDatabaseCallback(scope))
                        .build()
                    INSTANCE = instance
                }
                return instance
            }
        }

        private class SleepDatabaseCallback(val scope: CoroutineScope) : RoomDatabase.Callback() {
            override fun onCreate(db: SupportSQLiteDatabase) {
                super.onCreate(db)
                INSTANCE?.let { database ->
                    scope.launch(Dispatchers.IO) {
                        populateDatabase(database.sleepDatabaseDao())

                    }


                }
            }
        }

        suspend fun populateDatabase(sleepDatabaseDao: SleepDatabaseDao) {
            sleepDatabaseDao.clear()

            var sleepNight = SleepNight()
            sleepDatabaseDao.insert(sleepNight)
        }
    }
}





