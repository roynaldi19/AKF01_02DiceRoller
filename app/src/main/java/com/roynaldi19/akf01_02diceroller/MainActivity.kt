package com.roynaldi19.akf01_02diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.roynaldi19.akf01_02diceroller.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    val randomInt = (1..6).random()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.roolButton.setOnClickListener {
            roolDice()
        }

    }

    private fun roolDice() {
        //Toast.makeText(this, "Button Clicked", Toast.LENGTH_SHORT).show()
        binding.resultText.text = randomInt.toString()
    }
}