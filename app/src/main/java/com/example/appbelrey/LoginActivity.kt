package com.example.appbelrey

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.appbelrey.databinding.ActivityLoginBinding
import com.example.appbelrey.databinding.ActivitySplashBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}