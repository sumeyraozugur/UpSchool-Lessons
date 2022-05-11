package com.sum.lifeccycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.*

class MainActivity : AppCompatActivity(), DefaultLifecycleObserver {



    override fun onCreate(savedInstanceState: Bundle?) {
        super<AppCompatActivity>.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lifecycle.addObserver(this)



    }

    override fun onStart() {
        super<AppCompatActivity>.onStart()
        Log.v("AKBANK", "ON_START")
        playSound()
    }// alttaki ile farkı ne neden alttaki code yenilik olarak geldi.

    override fun onStart(owner: LifecycleOwner) {
        super<DefaultLifecycleObserver>.onStart(owner)
        Log.v("AKBANK","ON_START")
        playSound()
    }




    fun  playSound(){



    }




}