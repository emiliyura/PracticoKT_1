package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.myapplication.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    private lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Создание экземпляра класса FragmentFirstBinding и связывание его с разметкой фрагмента
        binding = FragmentFirstBinding.inflate(inflater, container, false)

        binding.btnNext.setOnClickListener {
            // Навигация к другому фрагменту с помощью NavController и указанием ID действия
            findNavController().navigate(R.id.action_firstFragment_to_secondFragment)
        }

        
        return binding.root
    }
}
