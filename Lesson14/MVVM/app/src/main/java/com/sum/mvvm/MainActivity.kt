package com.sum.mvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewModelFactory = FinalScoreViewModelFactory(10)
        val viewModel = ViewModelProvider(this, viewModelFactory).get(FinalScoreViewModel::class.java)




    }


}