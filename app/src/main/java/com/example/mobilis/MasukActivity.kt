package com.example.mobilis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MasukActivity : AppCompatActivity() {

    private lateinit var daftar: TextView
    private lateinit var mainagen : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_masuk)
        mainagen = findViewById(R.id.btn_masuk)
        daftar = findViewById(R.id.tv_daftar)
        daftar.setOnClickListener(View.OnClickListener {
            val intent= Intent(this@MasukActivity, DaftarActivity::class.java)
            startActivity(intent)
        })
        mainagen.setOnClickListener(View.OnClickListener {
            val intent= Intent(this@MasukActivity, MainagenActivity::class.java)
            startActivity(intent)
        })
    }
}