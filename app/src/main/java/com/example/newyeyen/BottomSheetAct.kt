package com.example.newyeyen

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.example.newyeyen.databinding.BottomsheetviewBinding
import com.ncorti.slidetoact.SlideToActView

class BottomSheetAct : DialogFragment() {

    private var _binding: BottomsheetviewBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = BottomsheetviewBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val slide = binding.sliderBottomSheet
        slide.animDuration = 600
        slide.bumpVibration = 500
        slide.onSlideCompleteListener = object : SlideToActView.OnSlideCompleteListener {
            override fun onSlideComplete(view: SlideToActView) {
                Log.d("BottomSheetAct", "Slide completed. Launching HomeAct.")
                val destinationIntent = Intent(requireContext(), HomeAct::class.java)
                startActivity(destinationIntent)
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
