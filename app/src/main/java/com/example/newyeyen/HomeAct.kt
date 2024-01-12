package com.example.newyeyen

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat

class HomeAct : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        WindowCompat.setDecorFitsSystemWindows(
            window, false
        )
        val prflbtn = findViewById<ImageView>(R.id.prfl)
        prflbtn.setOnClickListener {
            val intent = Intent(this, ProfileAct::class.java)
            startActivity(intent)
        }
        val settbtn = findViewById<ImageView>(R.id.img1)
        settbtn.setOnClickListener {
            val intent = Intent(this, SettingAct::class.java)
            startActivity(intent)
        }
        val msgbtn = findViewById<ImageView>(R.id.msg)
        msgbtn.setOnClickListener {
            val intent = Intent(this, ChatAct::class.java)
            startActivity(intent)
        }
    }
}