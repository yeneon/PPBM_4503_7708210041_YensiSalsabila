package com.example.newyeyen

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import java.util.Random

class ChatAct : AppCompatActivity() {
    var lsvchat: ListView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mainchat)

        lsvchat = findViewById<ListView>(R.id.lsvchat)

        lsvchat?.let {
            val arr: ArrayList<Chat> = ArrayList<Chat>()
            val r = Random()
            arr.add(Chat(R.drawable.sat, "Hey, are you okay there?", "Nurul"))
            arr.add(Chat(R.drawable.dul, "Are you home now?", "Min"))
            arr.add(Chat(R.drawable.tig, "Do you know about her?", "Ika"))
            arr.add(Chat(R.drawable.pat, "imy, careful babe.", "A word"))
            arr.add(Chat(R.drawable.ma, "i sent sumn money t ya", "Ibu"))
            arr.add(Chat(R.drawable.nem, "do you think i understand it?", "Dio"))
            arr.add(Chat(R.drawable.tjh, "im omw now", "Ka"))
            arr.add(Chat(R.drawable.pan, "Let's talk and meet somewhere.", "beast"))
            arr.add(Chat(R.drawable.lan, "i left my jacket in your car", "big bro"))

            val chatadapter = ChatAdpt(this, 0, arr)
            it.adapter = chatadapter
        }
    }
}
