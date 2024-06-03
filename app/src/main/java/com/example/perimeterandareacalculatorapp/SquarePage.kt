package com.example.perimeterandareacalculatorapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class SquarePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_square_page)

        val lengthInput01 = findViewById<EditText>(R.id.LengthInput01)
        val perimeterSquareResult = findViewById<TextView>(R.id.PerimeterSquareResult)
        val calculatePerimeter01 = findViewById<Button>(R.id.CalculatePerimeter01)

        calculatePerimeter01.setOnClickListener {
            // Get the input from EditText as a string
            val lengthText = lengthInput01.text.toString()

            // Check if the input is not empty
            if (lengthText.isNotEmpty()) {
                try {
                    // Convert the input to a double
                    val length = lengthText.toDouble()

                    // Calculate the perimeter
                    val answer = 4 * length

                    // Update the TextView with the result
                    perimeterSquareResult.text = "The Answer is $answer."
                } catch (e: NumberFormatException) {
                    // Handle invalid input (not a number)
                    perimeterSquareResult.text = "Invalid input. Please enter a valid number."
                }
            } else {
                // Handle empty input
                perimeterSquareResult.text = "Input cannot be empty."
            }
        }
    }
}
