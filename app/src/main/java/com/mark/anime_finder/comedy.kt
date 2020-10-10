package com.mark.anime_finder

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class comedy : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comedy)

        val samuraiad = findViewById<Button>(R.id.samurai_button)
        samuraiad.setOnClickListener {
            val intent = Intent(this, samurai::class.java)
            startActivity(intent)
        }

        val gintamad = findViewById<Button>(R.id.gintama_button)
        gintamad.setOnClickListener {
            val intent = Intent(this, gintama::class.java)
            startActivity(intent)
        }

        val sakaiad = findViewById<Button>(R.id.sakai_button)
        sakaiad.setOnClickListener {
            val intent = Intent(this, sakai::class.java)
            startActivity(intent)
        }

    }
}