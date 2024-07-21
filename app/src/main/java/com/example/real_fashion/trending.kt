package com.example.real_fashion

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.real_fashion.databinding.ActivityTrendingBinding

class trending : AppCompatActivity() {
    lateinit var binding: ActivityTrendingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTrendingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnKids.setOnClickListener {
            val intent = Intent(this, KidsFashion::class.java)
            startActivity(intent)

        }






    }
}