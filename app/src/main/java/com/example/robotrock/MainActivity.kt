package com.example.robotrock

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.robotrock.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var n = 0
        val arr = resources.getStringArray(R.array.Daft_Punk)
        for (i in arr)
            binding.tvReto.setOnClickListener {

                binding.tvReto.text = arr[n].toString()
                n ++
                if (n > arr.size - 1) n = 0



            }

    }
}