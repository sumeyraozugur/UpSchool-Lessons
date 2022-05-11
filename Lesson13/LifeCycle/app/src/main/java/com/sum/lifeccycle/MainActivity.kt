package com.sum.lifeccycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

class MainActivity : AppCompatActivity(), LifecycleObserver {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lifecycle.addObserver(this)
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun  playSound(){
        Log.v("AKBANK", "ON_START")

    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun playVideo(){
        Log.v("AKBANK", "ON_START")

    }



    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun  stopVide(){
        Log.v("AKBANK", "ON_PAUSE")

    }

}