package com.example.mobilis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.mobilis.databinding.ActivityPilihUserBinding

class PilihUserActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPilihUserBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPilihUserBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val viewPagerAdapter = ViewPagerAdapter(this)
        binding.slideViewPager.adapter = viewPagerAdapter
        binding.dots.setViewPager(binding.slideViewPager)
        binding.btnPilihDaftar.setOnClickListener {
            val intent = Intent(this@PilihUserActivity, DaftarActivity::class.java)
            startActivity(intent)
        }
    }
}