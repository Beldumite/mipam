package com.example.kk2

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import com.example.kk2.databinding.ActivityMainBinding
import com.airbnb.lottie.LottieAnimationView
import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.content.Intent
import android.os.Handler
import android.os.Looper

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.loading)

        val loadingani = findViewById<LottieAnimationView>(R.id.animationLoading)
        loadingani.playAnimation()

        Handler(Looper.getMainLooper()).postDelayed({
            AppNavigator.navigateToSignUp(this  )
        }, 1500)
    }

}