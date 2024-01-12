package com.example.newyeyen

import android.content.Intent
import android.os.Bundle
import android.widget.AdapterView.OnItemClickListener
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class GetHelpAct : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gethelp)
        val listView = findViewById<ListView>(R.id.listview)
        val list: MutableList<String> = ArrayList()
        list.add("Whatsapp")
        list.add("Telegram")
        list.add("Instagram")
        list.add("Pinterest")
        list.add("Facebook")
        list.add("Twitter")
        list.add("Youtube")
        list.add("TikTok")
        list.add("Reddit")
        list.add("Line")
        list.add("Twitch")
        val arrayAdapter: ArrayAdapter<*> =
            ArrayAdapter(this, android.R.layout.simple_list_item_1, list)
        listView.adapter = arrayAdapter
        listView.onItemClickListener = OnItemClickListener { parent, view, position, id ->
            if (position == 0) {
                //clicked wa
                startActivity(Intent(this@GetHelpAct, ScmdWangsafAct::class.java))
            } else if (position == 1) {
                //clicked tele
                startActivity(Intent(this@GetHelpAct, ScmdTelegramAct::class.java))
            } else if (position == 2) {
                //clicked tele
                startActivity(Intent(this@GetHelpAct, ScmdInstagramAct::class.java))
            } else if (position == 3) {
                //clicked tele
                startActivity(Intent(this@GetHelpAct, ScmdPinterestAct::class.java))
            } else if (position == 4) {
                //clicked tele
                startActivity(Intent(this@GetHelpAct, ScmdFacebookAct::class.java))
            } else if (position == 5) {
                //clicked tele
                startActivity(Intent(this@GetHelpAct, ScmdTwitterAct::class.java))
            } else if (position == 6) {
                //clicked tele
                startActivity(Intent(this@GetHelpAct, ScmdYoutubeAct::class.java))
            } else if (position == 7) {
                //clicked tele
                startActivity(Intent(this@GetHelpAct, ScmdTiktokAct::class.java))
            } else if (position == 8) {
                //clicked tele
                startActivity(Intent(this@GetHelpAct, ScmdRedditAct::class.java))
            } else if (position == 9) {
                //clicked tele
                startActivity(Intent(this@GetHelpAct, ScmdLineAct::class.java))
            } else if (position == 10) {
                //clicked tele
                startActivity(Intent(this@GetHelpAct, ScmdQuoraAct::class.java))
            }
        }
    }
}