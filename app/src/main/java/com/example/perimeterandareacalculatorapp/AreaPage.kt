package com.example.perimeterandareacalculatorapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AreaPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_area_page)

        val AreaSquareButton = findViewById<Button>(R.id.AreaSquareButton)

        val AreaRectangleButton = findViewById<Button>(R.id.AreaRectangleButton)

        val AreaTriangleButton = findViewById<Button>(R.id.AreaTriangleButton)

        val AreaCircleButton = findViewById<Button>(R.id.AreaCircleButton)



        AreaSquareButton.setOnClickListener {

            val intent = Intent(this, SquarePage02::class.java)
               startActivity(intent)


        }

        AreaRectangleButton.setOnClickListener {

            val intent = Intent(this, RectanglePage02::class.java)
            startActivity(intent)
        }

        AreaTriangleButton.setOnClickListener {

            val intent = Intent(this, TrianglePage02::class.java)
            startActivity(intent)
        }

        AreaCircleButton.setOnClickListener {

            val intent = Intent(this, CirclePage02::class.java)
            startActivity(intent)
        }
    }
}