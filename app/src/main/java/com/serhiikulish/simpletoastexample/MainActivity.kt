package com.serhiikulish.simpletoastexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import android.view.Gravity
import android.view.LayoutInflater
import android.graphics.Color
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Long and Short Toast messages
        val btnShort = findViewById<Button>(R.id.button1) as Button
        val btnLong = findViewById<Button>(R.id.button2) as Button

        btnShort.setOnClickListener {
            Toast.makeText(this@MainActivity, "Short Toast Message", Toast.LENGTH_SHORT).show()
        }

        btnLong.setOnClickListener {
            Toast.makeText(this@MainActivity, "Long Toast Message", Toast.LENGTH_LONG).show()
        }

        // Custom Toast with Image
        val btnCustom = findViewById<Button>(R.id.button3) as Button

        val layoutInflater: LayoutInflater = layoutInflater

        val viewLayInf =
            layoutInflater.inflate(R.layout.custom_toast, findViewById(R.id.custom_layout))
        btnCustom.setOnClickListener {
            val customToast = Toast.makeText(this@MainActivity, "Custom Toast", Toast.LENGTH_SHORT)
            customToast.setGravity(Gravity.BOTTOM, 0, 0)
            customToast.view = viewLayInf
            customToast.show()
        }

        //Positioning Toast Messages

        val btnTop = findViewById<Button>(R.id.button4) as Button
        val btnCenter = findViewById<Button>(R.id.button5) as Button
        val btnBottom = findViewById<Button>(R.id.button6) as Button
        val btnLeft = findViewById<Button>(R.id.button7) as Button
        val btnRight = findViewById<Button>(R.id.button8) as Button
        val btnTopLeft = findViewById<Button>(R.id.button9) as Button

        btnTop.setOnClickListener {
            val toast = Toast.makeText(this@MainActivity, "Toast:Gravity.TOP", Toast.LENGTH_SHORT)
            toast.setGravity(Gravity.TOP, 0, 0)
            toast.show()
        }

        btnCenter.setOnClickListener {
            val toast =
                Toast.makeText(this@MainActivity, "Toast:Gravity.Center", Toast.LENGTH_SHORT)
            toast.setGravity(Gravity.CENTER, 0, 0)
            toast.show()
        }

        btnBottom.setOnClickListener {
            val toast =
                Toast.makeText(this@MainActivity, "Toast:Gravity.Bottom", Toast.LENGTH_SHORT)
            toast.setGravity(Gravity.BOTTOM, 0, 0)
            toast.show()
        }

        btnLeft.setOnClickListener {
            val toast =
                Toast.makeText(this@MainActivity, "Toast:Gravity.Left", Toast.LENGTH_SHORT)
            toast.setGravity(Gravity.START, 0, 0)
            toast.show()
        }

        btnRight.setOnClickListener {
            val toast =
                Toast.makeText(this@MainActivity, "Toast:Gravity.Right", Toast.LENGTH_SHORT)
            toast.setGravity(Gravity.END, 0, 0)
            toast.show()
        }

        btnTopLeft.setOnClickListener {
            val toast =
                Toast.makeText(this@MainActivity, "Toast:Gravity.Top&Left", Toast.LENGTH_SHORT)
            toast.setGravity(Gravity.TOP or Gravity.START, 0, 0)
            toast.show()
        }

        //Adding Color Toast
        lateinit var colorButton: Button

        colorButton = findViewById(R.id.button10)
        colorButton.setOnClickListener {
            val colorToast =
                Toast.makeText(this@MainActivity, "This is colored Toast", Toast.LENGTH_LONG)
            colorToast.view?.setBackgroundResource(R.drawable.toast_background)
            val colorToastText = colorToast.view?.findViewById<TextView>(android.R.id.message)
            colorToastText?.setTextColor(Color.parseColor("#ffffff"))
            colorToast.show()

        }
    }
}