package com.sum.lifeccycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

class MainActivity : AppCompatActivity(), LifecycleObserver {
    private var start:Boolean = false


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lifecycle.addObserver(this)
        start = lifecycle.currentState.isAtLeast(Lifecycle.State.STARTED)
        playSound()

    }

    override fun onStart() {
        super.onStart()

    }




    fun  playSound(){
        if(start)
        Log.v("AKBANK", "ON_START")

    }


    fun playVideo(){
        Log.v("AKBANK", "ON_START")

    }


    fun  stopVide(){
        Log.v("AKBANK", "ON_PAUSE")

    }

}