package com.example.cardview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onSupportNavigateUp(): Boolean =
        findNavController(R.id.navigationHostFragment).navigateUp()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navController = findNavController(R.id.navigationHostFragment)
        setupActionBarWithNavController(navController, AppBarConfiguration(navController.graph))
    }
}