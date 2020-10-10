package com.mark.anime_finder

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class adventure : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adventure)

        val narutoad = findViewById<Button>(R.id.naruto_button)
        narutoad.setOnClickListener {
            val intent = Intent(this, naruto::class.java)
            startActivity(intent)
        }

        val hunterad = findViewById<Button>(R.id.hunter_button)
        hunterad.setOnClickListener {
            val intent = Intent(this, hunter::class.java)
            startActivity(intent)
        }

        val attackad = findViewById<Button>(R.id.attack_button)
        attackad.setOnClickListener {
            val intent = Intent(this, attack::class.java)
            startActivity(intent)
        }
    }
}