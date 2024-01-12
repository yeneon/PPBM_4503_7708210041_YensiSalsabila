package com.example.newyeyen

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class ProfileAct : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profil)

        val homeimage = findViewById<ImageView>(R.id.img5)
        homeimage.setOnClickListener {
            val intent = Intent(this@ProfileAct, HomeAct::class.java)
            startActivity(intent)
        }
    }
}