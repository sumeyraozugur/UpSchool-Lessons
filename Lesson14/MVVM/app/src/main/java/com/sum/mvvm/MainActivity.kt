package com.sum.mvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val plusButton = findViewById<Button>(R.id.plusButton)
        val minusButton = findViewById<Button>(R.id.minusButton)
        val scoreText = findViewById<TextView>(R.id.scoreText)

        val viewModel = ViewModelProvider(this).get(GameViewModel::class.java)

        plusButton.setOnClickListener {
            viewModel.onPlusScore()
        }
        minusButton.setOnClickListener {
            viewModel.onMinusScore()
        }

        scoreText.text = viewModel.score.value.toString()
    }


}