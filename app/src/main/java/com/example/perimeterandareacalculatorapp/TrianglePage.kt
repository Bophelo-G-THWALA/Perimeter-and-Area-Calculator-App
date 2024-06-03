package com.example.perimeterandareacalculatorapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class TrianglePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_triangle_page)

        val sideInput01 = findViewById<EditText>(R.id.SideInput01)
        val sideInput02 = findViewById<EditText>(R.id.SideInput02)
        val sideInput03 = findViewById<EditText>(R.id.SideInput03)
        val calculatePerimeter03 = findViewById<Button>(R.id.CalculatePerimeter03)
        val perimeterTriangleResult = findViewById<TextView>(R.id.PerimeterTriangleResult)

        calculatePerimeter03.setOnClickListener {
            // Get the input from EditText as strings
            val sideText01 = sideInput01.text.toString()
            val sideText02 = sideInput02.text.toString()
            val sideText03 = sideInput03.text.toString()

            // Check if the inputs are not empty
            if (sideText01.isNotEmpty() && sideText02.isNotEmpty() && sideText03.isNotEmpty()) {
                try {
                    // Convert the inputs to doubles
                    val side1 = sideText01.toDouble()
                    val side2 = sideText02.toDouble()
                    val side3 = sideText03.toDouble()

                    // Calculate the perimeter
                    val answer = side1 + side2 + side3

                    // Update the TextView with the result
                    perimeterTriangleResult.text = "The Answer is $answer."
                } catch (e: NumberFormatException) {
                    // Handle invalid input (not a number)
                    perimeterTriangleResult.text = "Invalid input. Please enter valid numbers."
                }
            } else {
                // Handle empty input
                perimeterTriangleResult.text = "Inputs cannot be empty."
            }
        }
    }
}
