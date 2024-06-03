package com.example.perimeterandareacalculatorapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PerimeterPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_perimeter_page)

        val PerimeterSquareButton = findViewById<Button>(R.id.PerimeterSquareButton)

        val PerimeterRectangleButton = findViewById<Button>(R.id.PerimeterRectangleButton)

        val PerimeterTriangleButton = findViewById<Button>(R.id.PerimeterTriangleButton)

        val PerimeterCircleButton = findViewById<Button>(R.id.PerimeterCircleButton)


        PerimeterSquareButton.setOnClickListener {

            val intent = Intent(this, SquarePage::class.java)
            startActivity(intent)


        }


        PerimeterRectangleButton.setOnClickListener {

            val intent = Intent(this, RectanglePage::class.java)
            startActivity(intent)

        }



        PerimeterTriangleButton.setOnClickListener {

            val intent = Intent(this, TrianglePage::class.java)
            startActivity(intent)


        }

        PerimeterCircleButton.setOnClickListener {

            val intent = Intent(this, CirclePage::class.java)
            startActivity(intent)

        }

    }
}