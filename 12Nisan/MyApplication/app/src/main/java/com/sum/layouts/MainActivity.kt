package com.sum.layouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.sum.layouts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(),View.OnClickListener {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =DataBindingUtil.setContentView(this@MainActivity,R.layout.activity_main)
        //setContentView(R.layout.activity_main)

        init()
    }
    private fun init(){
        binding.myButton.text ="asakjskaskask"
        binding.myButton.setOnClickListener(this)
        binding.myButton2.setOnClickListener(this)
        binding.myText

    }

    override fun onClick(view: View?) {
        when(view?.id){
            binding.myButton.id -> {
                //Click Listener
            }
            binding.myButton2.id ->{}
        }
    }
}