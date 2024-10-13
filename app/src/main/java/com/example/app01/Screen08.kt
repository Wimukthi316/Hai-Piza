package com.example.app01

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Screen08 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_screen08)

        val image01 = findViewById<ImageView>(R.id.back_Arrow)
        val image02 = findViewById<ImageView>(R.id.imageView60)
        val image03 = findViewById<ImageView>(R.id.imageView63)

        image01.setOnClickListener { navigateToHome("Screen06") }
        image02.setOnClickListener { navigateToHome("Screen06") }
        image03.setOnClickListener { navigateToExit("Screen09") }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    private fun navigateToExit(s: String) {

        val intent = Intent(this, Screen09::class.java)
        startActivity(intent)

    }

    private fun navigateToHome(s: String) {

        val intent = Intent(this, Screen06::class.java)
        startActivity(intent)

    }
}