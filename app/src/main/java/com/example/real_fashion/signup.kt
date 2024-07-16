package com.example.real_fashion

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.real_fashion.databinding.ActivitySignupBinding

class signup : AppCompatActivity() {
    lateinit var binding: ActivitySignupBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivitySignupBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)


        setContentView(binding.root)
        binding.tvalready.setOnClickListener {
            val intent = Intent(this, login::class.java)
            startActivity(intent)
        }
        binding.btsignuptwo.setOnClickListener {
            validateRegistration()


        }
    }
    fun validateRegistration() {
        clearErrors()

        var formErrors = false
        val fullname = binding.tilfullname.text.toString()
        if (fullname.isBlank()) {
            formErrors = true
            binding.tvname.error = "fullname is required"

        }
        val username = binding.tilusrname.text.toString()
        if (username.isBlank()) {
            formErrors = true

            binding.tvusername.error = "user Name  is required"

        }
        val email = binding.tiluseremail.text.toString()
        if (email.isBlank()) {
            formErrors = true
            binding.tilemail.error = "email is required"

        }
        val password = binding.tilpass.text.toString()
        if (password.isBlank()) {
            formErrors = true
            binding.tvpass.error = "password is required"

        }
        val confirmPassword = binding.tilconfir.text.toString()
        if (confirmPassword.isBlank()) {
            formErrors = true
            binding.tillocation.error = "password is required"

        }else if (password!=confirmPassword){
            formErrors= true
            binding.tilconfir.error = "passowrd does not match"
        }


    }

    fun clearErrors() {
        binding.tvfullname.error = null
        binding.tilemail.error = null
        binding.tvusername.error = null
        binding.tvpass.error = null
        binding.tvlocation.error = null

    }


}
