package com.example.perimeterandareacalculatorapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class TrianglePage02 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_triangle_page02)

        val lengthInput05 = findViewById<EditText>(R.id.LengthInput05).text

        val widthInput03 = findViewById<EditText>(R.id.WidthInput03).text

        val heightInput01 = findViewById<EditText>(R.id.HeightInput01).text

        val areaTriangleResult = findViewById<TextView>(R.id.AreaTriangleResult)

        val calculateArea03 = findViewById<Button>(R.id.CalculateArea03)


        calculateArea03.setOnClickListener {

            // Get the input from EditText as a string
            val lengthText = lengthInput05.toString()
            val widthText = widthInput03.toString()
            val heightText = heightInput01.toString()

            // Check if the input is not empty
            if (lengthText.isNotEmpty()) {
                try {
                    // Convert the input to a double
                    val length = lengthText.toDouble()
                    val width = widthText.toDouble()
                    val height = heightText.toDouble()

                    // Calculate the area
                    val base = length * width

                    val area = 0.5 * base * height

                    // Update the TextView with the result
                    areaTriangleResult.text = "The Area is $area."
                } catch (e: NumberFormatException) {
                    // Handle invalid input (not a number)
                    areaTriangleResult.text = "Invalid input. Please enter a valid number."
                }
            } else {
                // Handle empty input
                areaTriangleResult.text = "Input cannot be empty."
            }
        }
    }
}






