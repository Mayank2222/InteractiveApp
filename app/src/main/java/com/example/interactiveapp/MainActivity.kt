package com.example.interactiveapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    // Creating variable for btnDark and Reading as VAl since we won't be changing the values.
        val btnDark= findViewById<Button>(R.id.btnDark)
        val btnReading= findViewById<Button>(R.id.btnReading)
        val layout= findViewById<LinearLayout>(R.id.LinearLayout)

        btnDark.setOnClickListener{
            // change the colour to dark mode
            layout.setBackgroundResource(R.color.black)
        }
        btnReading.setOnClickListener {
            layout.setBackgroundResource(R.color.yellow)
        }
    }
}