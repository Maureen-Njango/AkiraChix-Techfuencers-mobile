package com.example.real_fashion

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.real_fashion.databinding.ActivityLoginBinding

class login : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)

        setContentView(binding.root)
        binding.tvsignup.setOnClickListener {
            val intent = Intent(this, signup::class.java)
            startActivity(intent)
        }

        binding.btnLogin.setOnClickListener{
            val intent =Intent(this,trending::class.java)
            startActivity(intent)
        }


    }

    fun validateRegistration() {
        clearErrors()


        var formErrors = false
        val fullname = binding.tiluser.text.toString()
        if (fullname.isBlank()) {
            formErrors = true
            binding.tvuser.error = "user name is required"

        }
        val passowrd = binding.tilpassword.text.toString()
        if (fullname.isBlank()) {
            formErrors = true
            binding.tvpassassword.error = "user name is required"

        }
        binding.btnLogin.setOnClickListener{
            val intent=Intent(this,trending::class.java)
            startActivity(intent)
        }

    }
    fun clearErrors() {
        binding.tvuser.error = null
        binding.tvpassassword.error = null

    }


}