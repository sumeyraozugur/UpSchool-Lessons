package com.sum.mvvm

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GameViewModel: ViewModel() {
    var score = MutableLiveData<Int>()

    fun onMinusScore(){
        score.value = score.value?.minus(1)

    }

    fun onPlusScore(){
        score.value = score.value?.plus(1)

    }

    init {
        score.value = 0
        Log.v("AKBANK", "GameViewModel")
    }

    override fun onCleared() {
        super.onCleared()
        Log.v("AKBANK","GameViewModel destroyed")
    }
}