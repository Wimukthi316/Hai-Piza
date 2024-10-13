package com.example.app01

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Screen06 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_screen06)

        val image01 = findViewById<ImageView>(R.id.imageView15)
        val image02 = findViewById<ImageView>(R.id.imageView16)
        val image03 = findViewById<ImageView>(R.id.imageView17)
        val image04 = findViewById<ImageView>(R.id.imageView14)
        val image05 = findViewById<ImageView>(R.id.imageView18)
        val image06 = findViewById<ImageView>(R.id.imageView19)
        val image07 = findViewById<ImageView>(R.id.imageView21)
        val image08 = findViewById<ImageView>(R.id.imageView23)
        val image09 = findViewById<ImageView>(R.id.imageButton2)



        image01.setOnClickListener { navigateToCategoriesPage("Screen07") }
        image02.setOnClickListener { navigateToCategoriesPage("Screen07") }
        image03.setOnClickListener { navigateToCategoriesPage("Screen07") }
        image04.setOnClickListener { navigateToCategoriesPage("Screen07") }
        image05.setOnClickListener { navigateToCategoriesPage("Screen07") }
        image06.setOnClickListener { navigateToCategoriesPage("Screen07") }
        image07.setOnClickListener { navigateToProfile("Screen08") }
        image09.setOnClickListener { navigateToProfile("Screen08") }
        image08.setOnClickListener { navigateToExit("Screen09") }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    private fun navigateToProfile(s: String) {
        val intent = Intent(this, Screen08::class.java)
        startActivity(intent)

    }

    private fun navigateToCategoriesPage(s: String) {
        val intent = Intent(this, Screen07::class.java)
        startActivity(intent)
    }
    private fun navigateToExit(s: String) {

        val intent = Intent(this, Screen09::class.java)
        startActivity(intent)

    }
}
