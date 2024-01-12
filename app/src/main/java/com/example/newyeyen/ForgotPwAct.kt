package com.example.newyeyen

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ForgotPwAct : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgotpw)
        val verif = findViewById<Button>(R.id.verif_btn)
        verif.setOnClickListener {
            val intent = Intent(this@ForgotPwAct, ForgotPwAct::class.java)
            startActivity(intent)
        }
    }
}