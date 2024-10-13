package com.example.app01

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Screen04 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_screen04)

        var button4 = findViewById<Button>(R.id.button4)

        button4.setOnClickListener{
            val intent = Intent(this, Screen05::class.java)
            startActivity(intent)
            finish()

        }
        val image35 = findViewById<ImageView>(R.id.imageView35)

        image35.setOnClickListener { navigateToScreen03("Screen02") }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    private fun navigateToScreen03(s: String) {

        val intent = Intent(this, Screen03::class.java)
        startActivity(intent)

    }
}