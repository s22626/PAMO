package com.example.myapplication

import android.content.Context
import android.content.Intent
import com.google.android.material.bottomnavigation.BottomNavigationView

object NavigationUtils {

    fun setupBottomNavigation(context: Context, bottomNavigationView: BottomNavigationView) {
        bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navigation_home -> {
                    val intent = Intent(context, MainActivity::class.java)
                    context.startActivity(intent)
                    true
                }
                R.id.navigation_calculate_bmr -> {
                    val intent = Intent(context, CalculateBMRActivity::class.java)
                    context.startActivity(intent)
                    true
                }
                R.id.navigation_dish -> {
                    val intent = Intent(context, Dishes::class.java)
                    context.startActivity(intent)
                    true
                }
                R.id.navigation_grocery_list -> {
                    val intent = Intent(context, GroceryListActivity::class.java)
                    context.startActivity(intent)
                    true
                }
                else -> false
            }
        }
    }
}

