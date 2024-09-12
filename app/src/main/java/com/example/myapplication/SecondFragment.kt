package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.myapplication.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    private lateinit var binding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Создание экземпляра класса FragmentSecondBinding и связывание его с разметкой фрагмента
        binding = FragmentSecondBinding.inflate(inflater, container, false)

        binding.btnNext.setOnClickListener {
            // Навигация к другому фрагменту с помощью NavController и указанием ID действия
            findNavController().navigate(R.id.action_secondFragment_to_thirdFragment)
        }

        binding.btnBack.setOnClickListener {
            // Возврат к предыдущему фрагменту
            findNavController().popBackStack()
        }

        // Возвращение корневого View разметки фрагмента
        return binding.root
    }
}
