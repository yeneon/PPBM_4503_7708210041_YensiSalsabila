package com.example.newyeyen

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class SplashscreenAct : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)
        Handler().postDelayed({
            // Intent untuk berpindah ke MainActivity (atau halaman tujuan anda)
            val mainIntent = Intent(this@SplashscreenAct, MainAct::class.java)
            startActivity(mainIntent)
            finish() //Menutup activity ini
        }, SPLASH_DISPLAY_LENGTH.toLong())
    }

    companion object {
        private const val SPLASH_DISPLAY_LENGTH = 3500
    }
}