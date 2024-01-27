package com.dimthomas.disgames.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dimthomas.disgames.R
import com.dimthomas.disgames.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}