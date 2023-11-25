package com.example.hotel.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.hotel.R
import com.example.hotel.databinding.FragmentPaidBinding

class PaidFragment : Fragment() {

    private var _binding: FragmentPaidBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        _binding = FragmentPaidBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.back.setOnClickListener {
            val act = PaidFragmentDirections.actionPaidFragmentToHotelFragment()
            findNavController().navigate(act)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}