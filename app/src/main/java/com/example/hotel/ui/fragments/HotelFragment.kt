package com.example.hotel.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.hotel.databinding.FragmentHotelBinding
import com.google.android.material.carousel.CarouselSnapHelper


class HotelFragment : Fragment() {
    private var _binding: FragmentHotelBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHotelBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val snapHelper = CarouselSnapHelper()
        snapHelper.attachToRecyclerView(binding.carouselRecyclerView)

        binding.positiveButton.setOnClickListener {
            val act = HotelFragmentDirections.actionHotelFragmentToRoomFragment()
            findNavController().navigate(act)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}