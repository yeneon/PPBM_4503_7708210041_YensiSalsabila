package com.example.newyeyen

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomsheet.BottomSheetDialog

class LoginAct : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val loginButton = findViewById<Button>(R.id.login_btn)
        loginButton.setOnClickListener {
            val bottomSheetDialog = BottomSheetDialog(this)
            val bottomSheetView = LayoutInflater.from(this).inflate(R.layout.bottomsheetview, null)
            bottomSheetDialog.setContentView(bottomSheetView)
            bottomSheetDialog.show()

            Handler(Looper.getMainLooper()).postDelayed({
                bottomSheetDialog.dismiss()
                val intent = Intent(this, HomeAct::class.java)
                startActivity(intent)
            }, 5000)
        }
        val forgot = findViewById<TextView>(R.id.frgt)
        forgot.setOnClickListener {
            val intent = Intent(this@LoginAct, ForgotPwAct::class.java)
            startActivity(intent)
            finish()
        }
    }
}