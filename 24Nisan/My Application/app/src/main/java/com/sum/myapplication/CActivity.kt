package com.sum.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class CActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cactivity)
        val textResult: TextView = findViewById(R.id.resultText)
        val data = intent.extras
        textResult.text = data?.getBoolean("isLogin").toString()
    }
}