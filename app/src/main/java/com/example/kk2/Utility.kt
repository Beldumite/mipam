package com.example.kk2

import android.app.Activity
import android.content.Intent
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import androidx.core.content.ContextCompat


object AppNavigator {

    fun navigateToSignUp(activity: Activity) {
        val intent = Intent(activity, Signup::class.java)
        activity.startActivity(intent)
        activity.finish()
    }
    fun navigateToSuccess(activity: Activity) {
        val intent = Intent(activity, Success::class.java)
        activity.startActivity(intent)
        activity.finish()
    }

    fun navigateToSignIn(activity: Activity) {
        val intent = Intent(activity, Signin::class.java)
        activity.startActivity(intent)
        activity.finish()
    }
    fun navigateToHome(activity: Activity) {
        val intent = Intent(activity, Home::class.java)
        activity.startActivity(intent)
        activity.finish()
    }

    fun loadFragment(activity: AppCompatActivity, fragment: Fragment) {
        activity.supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, fragment)
            .commit()
    }

    fun updateNavIcons(activity: Activity, selectedId : Int) {
        val green = ContextCompat.getColor(activity, R.color.lightgreen)
        val white = ContextCompat.getColor(activity, R.color.white)

        activity.findViewById<ImageView>(R.id.homeImage).setColorFilter(white)
        activity.findViewById<ImageView>(R.id.detailImage).setColorFilter(white)
        activity.findViewById<ImageView>(R.id.settingImage).setColorFilter(white)
        activity.findViewById<ImageView>(R.id.profileImage).setColorFilter(white)

        activity.findViewById<ImageView>(selectedId).setColorFilter(green)
    }

}




