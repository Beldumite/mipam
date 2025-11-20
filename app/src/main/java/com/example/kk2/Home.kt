package com.example.kk2

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.airbnb.lottie.LottieAnimationView
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.kk2.AppNavigator



class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        if (savedInstanceState == null) {
            AppNavigator.loadFragment(this, HomeFragment())
        }

        findViewById<ConstraintLayout>(R.id.homeButton).setOnClickListener {
            AppNavigator.loadFragment(this, HomeFragment())
        }

        findViewById<ConstraintLayout>(R.id.settingButton).setOnClickListener {
            AppNavigator.loadFragment(this,SettingsFragment())
        }

        findViewById<ConstraintLayout>(R.id.detailButton).setOnClickListener {
            AppNavigator.loadFragment(this, DetailFragment())
        }

        findViewById<ConstraintLayout>(R.id.profileButton).setOnClickListener {
            AppNavigator.loadFragment(this, ProfileFragment())
        }

    }
}