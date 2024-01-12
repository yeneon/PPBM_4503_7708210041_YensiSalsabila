package com.example.newyeyen

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LanguageAct : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_language)
        val bahasa =
            arrayOf("Bahasa Indonesia", "English", "Español", "Français", "Deutsch", "日本語")

        // Inisialisasi spinner
        val spinner = findViewById<Spinner>(R.id.spinner)

        // Inisialisasi adapter
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, bahasa)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        // Menghubungkan adapter dengan spinner
        spinner.adapter = adapter
        // Menambahkan penanganan pilihan spinner
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parentView: AdapterView<*>?,
                selectedItemView: View,
                position: Int,
                id: Long
            ) {
                // Tindakan yang diambil saat pengguna memilih item
                val selectedLanguage = bahasa[position]
                Toast.makeText(this@LanguageAct, "Choosen: $selectedLanguage", Toast.LENGTH_SHORT)
                    .show()
            }

            override fun onNothingSelected(parentView: AdapterView<*>?) {
                // Tindakan yang diambil ketika tidak ada yang dipilih
            }
        }
    }
}