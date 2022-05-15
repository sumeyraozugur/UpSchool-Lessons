package com.sum.mvvm

import android.util.Log
import androidx.lifecycle.ViewModel

class FinalScoreViewModel(private val finalScore:Int): ViewModel() {

    init{
        Log.v("AKBANK","GameFinished! - Final Score : ${finalScore}")
    }
}