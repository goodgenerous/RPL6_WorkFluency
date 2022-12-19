package com.example.mobilis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        Handler(mainLooper).postDelayed({
            val intent = Intent(this@SplashScreenActivity, PilihUserActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000)
    }
}