package com.sum.roomdatabase

import androidx.annotation.WorkerThread
import androidx.lifecycle.LiveData
import kotlinx.coroutines.flow.Flow


class SleepRepository(private val sleepDatabaseDao: SleepDatabaseDao) {

    val allSleepNights : LiveData<List<SleepNight>?> = sleepDatabaseDao.getAllNights()

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun insert(sleepNight: SleepNight){
        sleepDatabaseDao.insert(sleepNight)
    }
}