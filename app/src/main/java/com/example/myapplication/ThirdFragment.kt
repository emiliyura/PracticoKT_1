package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.myapplication.databinding.FragmentThirdBinding

class ThirdFragment : Fragment() {

    private lateinit var binding: FragmentThirdBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Создание экземпляра класса FragmentThirdBinding и связывание его с разметкой фрагмента
        binding = FragmentThirdBinding.inflate(inflater, container, false)

        binding.btnBack.setOnClickListener {
            
            findNavController().popBackStack()
        }

    
        return binding.root
    }
}
