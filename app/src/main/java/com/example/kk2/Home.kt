package com.example.kk2


import android.content.Intent
import androidx.core.content.ContextCompat
import androidx.core.widget.ImageViewCompat
import android.content.res.ColorStateList
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
            AppNavigator.updateNavIcons(this, R.id.homeImage)
        }

        findViewById<ConstraintLayout>(R.id.homeButton).setOnClickListener {
            AppNavigator.loadFragment(this, HomeFragment())
            AppNavigator.updateNavIcons(this, R.id.homeImage)
        }

        findViewById<ConstraintLayout>(R.id.settingButton).setOnClickListener {
            AppNavigator.loadFragment(this,SettingsFragment())
            AppNavigator.updateNavIcons(this, R.id.settingImage)
        }

        findViewById<ConstraintLayout>(R.id.detailButton).setOnClickListener {
            AppNavigator.loadFragment(this, DetailFragment())
            AppNavigator.updateNavIcons(this, R.id.detailImage)
        }

        findViewById<ConstraintLayout>(R.id.profileButton).setOnClickListener {
            AppNavigator.loadFragment(this, ProfileFragment())
            AppNavigator.updateNavIcons(this, R.id.profileImage)
        }


    }
}