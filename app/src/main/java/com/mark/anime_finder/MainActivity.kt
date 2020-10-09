package com.mark.anime_finder

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val animeone = findViewById<Button>(R.id.adventure_button)
        animeone.setOnClickListener {
            val intent = Intent(this, adventure::class.java)
            startActivity(intent)
        }

        val animetwo = findViewById<Button>(R.id.comedy_button)
        animetwo.setOnClickListener {
            val intent = Intent(this, comedy::class.java)
            startActivity(intent)
        }

        val animefinal = findViewById<Button>(R.id.drama_button)
        animefinal.setOnClickListener {
            val intent = Intent(this, drama::class.java)
            startActivity(intent)
        }
    }
}