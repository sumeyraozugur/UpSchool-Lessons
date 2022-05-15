package com.sum.mvvm

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class FinalScoreViewModelFactory(private val finasScore:Int): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return FinalScoreViewModel(finasScore) as T
    }
}