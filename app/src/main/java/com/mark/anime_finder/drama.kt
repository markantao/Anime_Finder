package com.mark.anime_finder

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class drama : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drama)

        val marchad = findViewById<Button>(R.id.march_button)
        marchad.setOnClickListener {
            val intent = Intent(this, march::class.java)
            startActivity(intent)
        }

        val tsukiad = findViewById<Button>(R.id.tsuki_button)
        tsukiad.setOnClickListener {
            val intent = Intent(this, tsuki::class.java)
            startActivity(intent)
        }

        val anohanad = findViewById<Button>(R.id.anohana_button)
        anohanad.setOnClickListener {
            val intent = Intent(this, anohana::class.java)
            startActivity(intent)
        }
    }
}