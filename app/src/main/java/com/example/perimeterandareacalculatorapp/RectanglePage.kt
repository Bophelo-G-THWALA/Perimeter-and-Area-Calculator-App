package com.example.perimeterandareacalculatorapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class RectanglePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_rectangle_page)

        val lengthInput02 = findViewById<EditText>(R.id.LengthInput02)
        val widthInput01 = findViewById<EditText>(R.id.WidthInput01)
        val perimeterRectangleResult = findViewById<TextView>(R.id.PerimeterRectangleResult)
        val calculatePerimeter02 = findViewById<Button>(R.id.CalculatePerimeter02)

        calculatePerimeter02.setOnClickListener {
            // Get the input from EditText as strings
            val lengthText = lengthInput02.text.toString()
            val widthText = widthInput01.text.toString()

            // Check if the inputs are not empty
            if (lengthText.isNotEmpty() && widthText.isNotEmpty()) {
                try {
                    // Convert the inputs to doubles
                    val length = lengthText.toDouble()
                    val width = widthText.toDouble()

                    // Calculate the perimeter
                    val answer = 2 * (length + width)

                    // Update the TextView with the result
                    perimeterRectangleResult.text = "The Perimeter is $answer."
                } catch (e: NumberFormatException) {
                    // Handle invalid input (not a number)
                    perimeterRectangleResult.text = "Invalid input. Please enter valid numbers."
                }
            } else {
                // Handle empty input
                perimeterRectangleResult.text = "Inputs cannot be empty."
            }
        }
    }
}
