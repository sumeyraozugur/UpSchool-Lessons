package com.sum.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.v("AKBANK", "onCreate Called")
    }

    override fun onStart() {
        super.onStart()
        Log.v("AKBANK", "onStart Called")
    }

    override fun onPause() {
        super.onPause()
        Log.v("AKBANK", "onPause Called")
    }

    override fun onResume() {
        super.onResume()
        Log.v("AKBANK", "onResume Called")
    }

    override fun onStop() {
        super.onStop()
        Log.v("AKBANK", "onStop Called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.v("AKBANK", "onDestroy Called")
    }
}