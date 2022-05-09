package com.sum.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import java.util.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var button:Button
    private lateinit var dice:ImageView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button)
        dice = findViewById(R.id.imageView)

        button.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when(view?.id){
            R.id.button ->{
                rollDice()
            }

        }
    }

    private fun rollDice() {
        val randomInt = Random().nextInt(6)+1
        val drawableResource =when(randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6

        }
        dice.setImageResource(drawableResource)
    }
}