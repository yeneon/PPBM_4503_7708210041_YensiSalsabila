package com.example.newyeyen

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayoutMediator

class TabLayoutAct : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tab_layout)

        WindowCompat.setDecorFitsSystemWindows(
            window,false
        )

        val backbtn = findViewById<ImageView>(R.id.backBtn)
        backbtn.setOnClickListener {
            val intent = Intent(this, AboutAct::class.java)
            startActivity(intent)
            finish()}

        val viewPager = findViewById<ViewPager2>(R.id.viewPager)
        val adapter = ViewPagerAdapter(this)
        viewPager.adapter = adapter

        val tabLayout = findViewById<com.google.android.material.tabs.TabLayout>(R.id.tablayout)

        val tabTitles = arrayOf("Rating", "Feedback")

        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = tabTitles[position]
        }.attach()
    }

    private inner class ViewPagerAdapter(fragmentActivity: FragmentActivity) :
        FragmentStateAdapter(fragmentActivity) {

        override fun getItemCount(): Int {
            return 2
        }

        override fun createFragment(position: Int): Fragment {
            return when (position) {
                0 -> FragmentViewPager1.newInstance()
                1 -> FragmentViewPager2.newInstance()
                else -> throw IllegalArgumentException("Invalid position: $position")
            }
        }
    }
}