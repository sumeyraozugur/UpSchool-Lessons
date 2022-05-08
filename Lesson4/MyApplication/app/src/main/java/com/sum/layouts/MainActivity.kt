package com.sum.layouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.sum.layouts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var user: User
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =DataBindingUtil.setContentView(this@MainActivity,R.layout.activity_main)
        //setContentView(R.layout.activity_main)

        init()
    }
    private fun init(){
        user = User("Sümeyra","Özuğur")
        binding.setVariable(BR.user,user)// id 'kotlin-kapt' should add for BR


    }


}