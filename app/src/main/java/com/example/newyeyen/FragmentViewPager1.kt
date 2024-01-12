package com.example.newyeyen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class FragmentViewPager1 : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.activity_page_layout1, container, false)
    }

    companion object {
        fun newInstance(): FragmentViewPager1 {
            return FragmentViewPager1()
        }
    }
}