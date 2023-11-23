package com.example.hotel.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.hotel.databinding.FragmentHotelBinding
import com.example.hotel.ui.slider.ImageAdapter


class HotelFragment : Fragment() {
    private var _binding: FragmentHotelBinding? = null
    private val binding get() = _binding!!


    private lateinit var adapter: ImageAdapter
    private lateinit var viewPager: ViewPager2
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHotelBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter = ImageAdapter(requireActivity())
        viewPager = binding.slider
        viewPager.adapter = adapter
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}