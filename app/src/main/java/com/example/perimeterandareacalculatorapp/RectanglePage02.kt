package com.example.perimeterandareacalculatorapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class RectanglePage02 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_rectangle_page02)

        val lengthInput04 = findViewById<EditText>(R.id.LengthInput04).text

        val widthInput02 = findViewById<EditText>(R.id.WidthInput02).text

        val areaRectangleResult = findViewById<TextView>(R.id.AreaRectangleResult)

        val calculateArea02 = findViewById<Button>(R.id.CalculateArea02)


        calculateArea02.setOnClickListener {

            // Get the input from EditText as a string
            val lengthText = lengthInput04.toString()
            val widthText = widthInput02.toString()

            // Check if the input is not empty
            if (lengthText.isNotEmpty()) {
                try {
                    // Convert the input to a double
                    val length = lengthText.toDouble()
                    val width = widthText.toDouble()

                    // Calculate the area
                    val area = length * width

                    // Update the TextView with the result
                    areaRectangleResult.text = "The Area is $area."
                } catch (e: NumberFormatException) {
                    // Handle invalid input (not a number)
                    areaRectangleResult.text = "Invalid input. Please enter a valid number."
                }
            } else {
                // Handle empty input
                areaRectangleResult.text = "Input cannot be empty."
            }
        }
    }
}


