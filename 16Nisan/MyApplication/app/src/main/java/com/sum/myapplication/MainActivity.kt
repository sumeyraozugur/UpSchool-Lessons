package com.sum.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    private lateinit var image:ImageView
    private lateinit var button: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        image = findViewById(R.id.imageView)
        button =findViewById(R.id.button)
        val anim = AnimationUtils.loadAnimation(this, R.anim.my_anim)
        button.setOnClickListener {
            image.startAnimation(anim)

        }

    }
}