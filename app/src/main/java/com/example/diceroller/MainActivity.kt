package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

//Create class Dice random 6 sides
class Dice(private val numOfSides: Int) {
    fun roll(): Int {
        return (1..numOfSides).random()
    }
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //find button by id
        val rollButton: Button = findViewById(R.id.button)
        //setOnClick on button
        rollButton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        //Create Dice object with 6 sides
        val dice = Dice(6).roll();
        val dice2 = Dice(6).roll();
        val diceImage: ImageView = findViewById(R.id.imageView);
        val diceImage2: ImageView = findViewById(R.id.imageView2)
        val diceResult = when (dice) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        val diceResult2 = when (dice2) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(diceResult);
        diceImage.contentDescription = dice.toString()

        diceImage2.setImageResource(diceResult2);
        diceImage2.contentDescription = dice2.toString()

    }
}