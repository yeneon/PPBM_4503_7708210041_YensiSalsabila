package com.example.newyeyen

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel
import com.ncorti.slidetoact.SlideToActView

class AboutAct : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        val rate = findViewById<Button>(R.id.btnfb)
        rate.setOnClickListener {
            val intent = Intent(this@AboutAct, TabLayoutAct::class.java)
            startActivity(intent)
        }

        val imageList = ArrayList<SlideModel>()

        imageList.add(SlideModel(R.drawable.cheers, ScaleTypes.CENTER_INSIDE))
        imageList.add(SlideModel(R.drawable.fb, ScaleTypes.CENTER_INSIDE))
        imageList.add(SlideModel(R.drawable.lin, ScaleTypes.CENTER_INSIDE))
        imageList.add(SlideModel(R.drawable.red, ScaleTypes.CENTER_INSIDE))
        imageList.add(SlideModel(R.drawable.ig, ScaleTypes.CENTER_INSIDE))
        imageList.add(SlideModel(R.drawable.twitch, ScaleTypes.CENTER_INSIDE))
        imageList.add(SlideModel(R.drawable.wa, ScaleTypes.CENTER_INSIDE))
        imageList.add(SlideModel(R.drawable.tik, ScaleTypes.CENTER_INSIDE))
        imageList.add(SlideModel(R.drawable.x, ScaleTypes.CENTER_INSIDE))
        imageList.add(SlideModel(R.drawable.yt, ScaleTypes.CENTER_INSIDE))

        val imageSlider = findViewById<ImageSlider>(R.id.image_slider)
        imageSlider.setImageList(imageList)

    }
}