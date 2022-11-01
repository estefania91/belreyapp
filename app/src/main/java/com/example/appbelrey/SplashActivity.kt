package com.example.appbelrey

import android.animation.Animator
import android.animation.Animator.AnimatorListener
import android.content.Intent
import android.nfc.Tag
import android.os.Bundle
import android.util.Log
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import com.example.appbelrey.databinding.ActivitySplashBinding
import android.util.Log.d as logD

class SplashActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)


        }

    override fun onStart() {
        super.onStart()
        binding.splashAnimation?.playAnimation()

        binding.splashAnimation?.addAnimatorListener(object : Animator.AnimatorListener{

            override fun onAnimationStart(animation: Animator) {
            }

            override fun onAnimationEnd(animation: Animator) {
                val intent = Intent(applicationContext, LoginActivity::class.java)
                intent.flags =Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
                startActivity(intent)
                finish()
            }

            override fun onAnimationCancel(animation: Animator) {
            }

            override fun onAnimationRepeat(animation: Animator) {
            }
        })
    }
    }
