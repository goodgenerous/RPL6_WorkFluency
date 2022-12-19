package com.example.mobilis

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class DaftarActivity : AppCompatActivity() {

    private lateinit var login: TextView
    private lateinit var mainagen: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar)
        login = findViewById(R.id.tv_masuk)
        mainagen = findViewById(R.id.btn_daftar)
        login.setOnClickListener(View.OnClickListener {
            val intent= Intent(this@DaftarActivity, MasukActivity::class.java)
            startActivity(intent)
        })
        mainagen.setOnClickListener(View.OnClickListener {
            val intent= Intent(this@DaftarActivity, MainagenActivity::class.java)
            startActivity(intent)
        })
    }
}