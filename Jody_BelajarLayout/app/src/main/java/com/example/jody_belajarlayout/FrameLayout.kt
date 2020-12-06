package com.example.jody_belajarlayout

import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class FrameLayout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frame_layout)
    }

    fun onClick(v: View?) {
        val btnKlik: View = findViewById<View>(R.id.btn_klik)
        btnKlik.visibility = View.GONE

        val txtTombol: View = findViewById<View>(R.id.txt_tombol)
        txtTombol.visibility = View.VISIBLE
    }
}
