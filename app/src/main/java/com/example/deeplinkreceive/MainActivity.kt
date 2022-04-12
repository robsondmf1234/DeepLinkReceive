package com.example.deeplinkreceive

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.deeplinkreceive.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setClickListeners()
    }

    private fun setClickListeners() {
        binding.btnActivityA.setOnClickListener {

        }
        binding.btnActivityB.setOnClickListener {

        }
        binding.btnActivityC.setOnClickListener {

        }
    }
}