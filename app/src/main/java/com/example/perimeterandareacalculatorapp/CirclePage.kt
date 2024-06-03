package com.example.perimeterandareacalculatorapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class CirclePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_circle_page)

        val circleInput = findViewById<EditText>(R.id.CircleInput)
        val perimeterCircleResult = findViewById<TextView>(R.id.PerimeterCircleResult)
        val circumferenceButton = findViewById<Button>(R.id.CircumferenceButton)
        val diameterButton = findViewById<Button>(R.id.DiameterButton)
        val circlePerimeterButton = findViewById<Button>(R.id.CirclePerimeterButton)

        // Listener for circumference button
        circumferenceButton.setOnClickListener {
            val inputText = circleInput.text.toString()
            if (inputText.isNotEmpty()) {
                try {
                    val radius = inputText.toDouble()
                    val circumference = 2 * Math.PI * radius
                    perimeterCircleResult.text = "The Circumference is $circumference."
                } catch (e: NumberFormatException) {
                    perimeterCircleResult.text = "Invalid input. Please enter a valid number."
                }
            } else {
                perimeterCircleResult.text = "Input cannot be empty."
            }
        }

        // Listener for diameter button
        diameterButton.setOnClickListener {
            val inputText = circleInput.text.toString()
            if (inputText.isNotEmpty()) {
                try {
                    val radius = inputText.toDouble()
                    val diameter = 2 * radius
                    perimeterCircleResult.text = "The Diameter is $diameter."
                } catch (e: NumberFormatException) {
                    perimeterCircleResult.text = "Invalid input. Please enter a valid number."
                }
            } else {
                perimeterCircleResult.text = "Input cannot be empty."
            }
        }

        // Listener for perimeter button (assuming you meant circumference)
        circlePerimeterButton.setOnClickListener {
            val inputText = circleInput.text.toString()
            if (inputText.isNotEmpty()) {
                try {
                    val radius = inputText.toDouble()
                    val perimeter = 2 * Math.PI * radius
                    perimeterCircleResult.text = "The Perimeter is $perimeter."
                } catch (e: NumberFormatException) {
                    perimeterCircleResult.text = "Invalid input. Please enter a valid number."
                }
            } else {
                perimeterCircleResult.text = "Input cannot be empty."
            }
        }
    }
}
