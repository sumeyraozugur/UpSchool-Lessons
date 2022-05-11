package com.sum.lifeccycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onStart() {
        super.onStart()
        playSound()
        playVideo()
    }


    fun  playSound(){
        Log.v("AKBANK", "ON_START")

    }


    fun playVideo(){
        Log.v("AKBANK", "ON_START")

    }


    fun  stopVide(){
        Log.v("AKBANK", "ON_PAUSE")

    }

}