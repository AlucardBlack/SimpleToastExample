package com.serhiikulish.simpletoastexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import android.view.Gravity
import android.view.LayoutInflater
import android.view.ViewGroup

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnShort = findViewById<Button>(R.id.button1) as Button
        val btnLong = findViewById<Button>(R.id.button2) as Button

        btnShort.setOnClickListener {
            Toast.makeText(this@MainActivity, "Short Toast Message", Toast.LENGTH_SHORT).show()
        }

        btnLong.setOnClickListener {
            Toast.makeText(this@MainActivity, "Long Toast Message", Toast.LENGTH_LONG).show()
        }

        val btnCustom = findViewById<Button>(R.id.button3) as Button

        val layoutInflater: LayoutInflater = layoutInflater

        val viewLayInfl =
            layoutInflater.inflate(R.layout.custom_toast, findViewById(R.id.custom_layout))
        btnCustom.setOnClickListener {
            val customToast = Toast.makeText(this@MainActivity, "Custom Toast",Toast.LENGTH_SHORT)
            customToast.setGravity(Gravity.BOTTOM,0,0)
            customToast.view = viewLayInfl
            customToast.show()
        }
    }
}