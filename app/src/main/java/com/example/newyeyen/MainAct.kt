package com.example.newyeyen

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainAct : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val login = findViewById<Button>(R.id.btn_login)
        login.setOnClickListener {
            val intent = Intent(this@MainAct, LoginAct::class.java)
            startActivity(intent)
            finish()
        }
        val signup = findViewById<Button>(R.id.btn_signup)
        signup.setOnClickListener {
            val intent = Intent(this@MainAct, RegistAct::class.java)
            startActivity(intent)
            finish()
        }
    }
}