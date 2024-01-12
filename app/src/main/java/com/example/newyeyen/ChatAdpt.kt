package com.example.newyeyen

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class ChatAdpt(private val ct: Context, resource: Int, objects: List<Chat>) :
    ArrayAdapter<Chat?>(
        ct, resource, objects
    ) {
    private val arr: ArrayList<Chat>

    init {
        arr = ArrayList(objects)
    }

    override fun getView(position: Int, convertview: View?, parent: ViewGroup): View {
        var convertview = convertview
        if (convertview == null) {
            val i = ct.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            convertview = i.inflate(R.layout.awnitem, null)
        }
        if (arr.size > 0) {
            val d = arr[position]
            val imgcht = convertview!!.findViewById<ImageView>(R.id.imgcht)
            val txtchatname = convertview.findViewById<TextView>(R.id.txtchatname)
            val txtdesk = convertview.findViewById<TextView>(R.id.txtcht)
            imgcht.setImageResource(d.image)
            txtchatname.text = d.chatName
            txtdesk.text = d.contain
            convertview.setOnClickListener {
                val clickedchat = arr[position]
                val chatname = clickedchat.chatName
                if (chatname.equals("Nurul", ignoreCase = true)) {
                    val intent = Intent(ct, PersonNurul::class.java)
                    ct.startActivity(intent)
                } else if (chatname.equals("Min", ignoreCase = true)) {
                    val intent = Intent(ct, PersonMin::class.java)
                    ct.startActivity(intent)
                } else if (chatname.equals("Ika", ignoreCase = true)) {
                    val intent = Intent(ct, PersonIka::class.java)
                    ct.startActivity(intent)
                } else if (chatname.equals("A word", ignoreCase = true)) {
                    val intent = Intent(ct, PersonAword::class.java)
                    ct.startActivity(intent)
                } else if (chatname.equals("Ibu", ignoreCase = true)) {
                    val intent = Intent(ct, PersonIbu::class.java)
                    ct.startActivity(intent)
                } else if (chatname.equals("Dio", ignoreCase = true)) {
                    val intent = Intent(ct, PersonDio::class.java)
                    ct.startActivity(intent)
                } else if (chatname.equals("ka", ignoreCase = true)) {
                    val intent = Intent(ct, PersonKa::class.java)
                    ct.startActivity(intent)
                } else if (chatname.equals("beast", ignoreCase = true)) {
                    val intent = Intent(ct, PersonBeast::class.java)
                    ct.startActivity(intent)
                } else if (chatname.equals("Big bro", ignoreCase = true)) {
                    val intent = Intent(ct, PersonBigBro::class.java)
                    ct.startActivity(intent)
                }
            }
        }
        return convertview!!
    }
}
