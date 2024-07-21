package com.example.real_fashion

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.real_fashion.databinding.ActivityKidsFashionBinding
import com.example.real_fashion.databinding.ActivityTrendingBinding

class KidsFashion : AppCompatActivity() {
    lateinit var binding: ActivityKidsFashionBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityKidsFashionBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvKids.layoutManager = LinearLayoutManager(this)
        displayKids()

    }


    fun displayKids() {
        val kid1 = Kids("", "Kids", "", "", "", "Cotton dress", "Jump short", "Cotton short")
        val kid2 = Kids("", "Kids", "", "", "", "Cotton dress", "Jump short", "Cotton short")
        val kid3 = Kids("", "Kids", "", "", "", "Cotton dress", "Jump short", "Cotton short")
        val kid4 = Kids("", "Kids", "", "", "", "Cotton dress", "Jump short", "Cotton short")
        val kid5 = Kids("", "Kids", "", "", "", "Cotton dress", "Jump short", "Cotton short")
        val kid6 = Kids("", "Kids", "", "", "", "Cotton dress", "Jump short", "Cotton short")
        val kid7 = Kids("", "Kids", "", "", "", "Cotton dress", "Jump short", "Cotton short")
        val kid8 = Kids("", "Kids", "", "", "", "Cotton dress", "Jump short", "Cotton short")
        val kid9 = Kids("", "Kids", "", "", "", "Cotton dress", "Jump short", "Cotton short")
        val kid10 = Kids("", "Kids", "", "", "", "Cotton dress", "Jump short", "Cotton short")

        val kids = listOf(kid1, kid2, kid3, kid4, kid5, kid6, kid7, kid8, kid9, kid10)
        val kidAdapter = KidsAdapter(kids)
        binding.rvKids.adapter = kidAdapter

    }
}