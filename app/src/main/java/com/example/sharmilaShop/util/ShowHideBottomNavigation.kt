package com.example.sharmilaShop.util

import androidx.fragment.app.Fragment
import com.example.sharmilaShop.R
import com.example.sharmilaShop.activities.ShoppingActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

fun Fragment.hideBottomNavigationView(){
    val bottomNavigationView =
        (activity as ShoppingActivity).findViewById<BottomNavigationView>(
            com.example.sharmilaShop.R.id.bottomNavigation
        )
    bottomNavigationView.visibility = android.view.View.GONE
}

fun Fragment.showBottomNavigationView(){
    val bottomNavigationView =
        (activity as ShoppingActivity).findViewById<BottomNavigationView>(
            com.example.sharmilaShop.R.id.bottomNavigation
        )
    bottomNavigationView.visibility = android.view.View.VISIBLE
}