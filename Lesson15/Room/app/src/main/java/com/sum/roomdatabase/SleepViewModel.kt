package com.sum.roomdatabase

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import java.lang.IllegalStateException


class SleepViewModel(private val sleepRepository: SleepRepository): ViewModel() {
    val allNights: LiveData<List<SleepNight>?> = sleepRepository.allSleepNights // asLiveData

    fun insert(sleepNight: SleepNight)= viewModelScope.launch{
        sleepRepository.insert(sleepNight)

    }
}
class SleepViewModelFactory(private val repository: SleepRepository): ViewModelProvider.Factory{
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(SleepViewModel::class.java)){
            return SleepViewModel(repository) as T

        }
        throw IllegalStateException("Unknown ViewModel class")
    }
}