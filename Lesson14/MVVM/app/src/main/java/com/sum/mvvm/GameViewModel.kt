package com.sum.mvvm

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GameViewModel: ViewModel() {
    private var _score = MutableLiveData<Int>()
    var score: LiveData<Int> = _score

    private var _eventGameFinish = MutableLiveData<Boolean>()
    var eventGameFinish :LiveData<Boolean> =_eventGameFinish

    fun onMinusScore(){
        _score.value = score.value?.minus(1)

    }

    fun onPlusScore(){
        when(_score.value){
            10 -> {_eventGameFinish.value = true}
            else -> {_score.value = score.value?.plus(1)}
        }


    }

    init {
        _score.value = 0
        Log.v("AKBANK", "GameViewModel")
    }

    override fun onCleared() {
        super.onCleared()
        Log.v("AKBANK","GameViewModel destroyed")
    }
}