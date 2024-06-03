package com.example.perimeterandareacalculatorapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class SquarePage02 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_square_page02)

        val lengthInput03 = findViewById<EditText>(R.id.LengthInput03)

        val areaSquareResult = findViewById<TextView>(R.id.AreaSquareResult)

        val calculateArea01 = findViewById<Button>(R.id.CalculateArea01)

        calculateArea01.setOnClickListener {
            // Get the input from EditText as a string
            val lengthText = lengthInput03.text.toString()

            // Check if the input is not empty
            if (lengthText.isNotEmpty()) {
                try {
                    // Convert the input to a double
                    val length = lengthText.toDouble()

                    // Calculate the area
                    val area = length * length

                    // Update the TextView with the result
                    areaSquareResult.text = "The Area is $area."
                } catch (e: NumberFormatException) {
                    // Handle invalid input (not a number)
                    areaSquareResult.text = "Invalid input. Please enter a valid number."
                }
            } else {
                // Handle empty input
                areaSquareResult.text = "Input cannot be empty."
            }
        }
    }
}
