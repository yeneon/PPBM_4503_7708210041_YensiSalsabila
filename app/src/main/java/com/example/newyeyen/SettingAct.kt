package com.example.newyeyen

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SettingAct : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seting)

        val about = findViewById<Button>(R.id.btn_abt)
        about.setOnClickListener {
            val intent = Intent(this@SettingAct, AboutAct::class.java)
            startActivity(intent)
        }
        val language = findViewById<Button>(R.id.btn_lgng)
        language.setOnClickListener {
            val intent = Intent(this@SettingAct, LanguageAct::class.java)
            startActivity(intent)
        }
        val gethelp = findViewById<Button>(R.id.gethelp)
        gethelp.setOnClickListener {
            val intent = Intent(this@SettingAct, GetHelpAct::class.java)
            startActivity(intent)
        }
    }
}
