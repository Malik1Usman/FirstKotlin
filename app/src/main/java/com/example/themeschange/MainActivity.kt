package com.example.themeschange

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintSet.GONE
import androidx.constraintlayout.widget.ConstraintSet.Layout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val Layout=findViewById<LinearLayout>(R.id.main)
   val darkTheme=findViewById<Button>(R.id.darkbtn)
   val lightTheme=findViewById<Button>(R.id.lightbtn)
        val movebtn=findViewById<Button>(R.id.movebtn)
        darkTheme.setOnClickListener{
Layout.setBackgroundResource(R.color.Dark)

        }
        lightTheme.setOnClickListener {
            Layout.setBackgroundResource(R.color.Light)
        }
        movebtn.setOnClickListener{
            intent= Intent(applicationContext,SecondActivity::class.java)
            startActivity(intent)
        }
    }
}