package com.sum.mvvm

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GameViewModel: ViewModel() {
    private var _score = MutableLiveData<Int>()
    var score: LiveData<Int> = _score

    fun onMinusScore(){
        _score.value = score.value?.minus(1)

    }

    fun onPlusScore(){
        _score.value = score.value?.plus(1)

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