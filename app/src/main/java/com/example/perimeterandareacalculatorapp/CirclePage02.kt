package com.example.perimeterandareacalculatorapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CirclePage02 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_circle_page02)

        val radiusInput01 = findViewById<EditText>(R.id.RadiusInput01).text

        val areaCircleResult = findViewById<TextView>(R.id.AreaCircleResult)

        val calculateArea04 = findViewById<Button>(R.id.CalculateArea04)


        calculateArea04.setOnClickListener {

            // Get the input from EditText as a string
            val radiusText = radiusInput01.toString()

            // Check if the input is not empty
            if (radiusText.isNotEmpty()) {
                try {
                    // Convert the input to a double
                    val radius = radiusText.toDouble()


                    // Calculate the area
                    val area = 3.14 * radius * radius

                    // Update the TextView with the result
                    areaCircleResult.text = "The Area is $area."
                } catch (e: NumberFormatException) {
                    // Handle invalid input (not a number)
                    areaCircleResult.text = "Invalid input. Please enter a valid number."
                }
            } else {
                // Handle empty input
                areaCircleResult.text = "Input cannot be empty."
            }
        }
    }
}




