package com.example.cardview

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class SplahScreenActivity : AppCompatActivity() {

    private val splash: Long = 5000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splah_screen)


        Handler().postDelayed({
            startActivity(Intent (this, MainActivity::class.java))
            finish()
        }, splash)

    }
}