package com.exampleivan.comparatorApp.firstApp.view

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.exampleivan.comparatorApp.firstApp.viewModel.CompViewModel
import com.exampleivan.pruebayoutube.databinding.ActivityFirstAppBinding


//Una clase es un contenedor de funciones
class FirstAppActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFirstAppBinding
    private val compViewModel: CompViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFirstAppBinding.inflate(layoutInflater)
        setContentView(binding.root)

        compViewModel.messageLN.observe(this){
            binding.message.text= it.textOne



        binding.button.setOnClickListener{

            compViewModel.hola()
        }
        }
        }


    }

