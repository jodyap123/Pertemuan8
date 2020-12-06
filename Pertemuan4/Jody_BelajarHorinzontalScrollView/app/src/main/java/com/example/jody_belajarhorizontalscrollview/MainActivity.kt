package com.example.jody_belajarhorizontalscrollview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var linearLayout: LinearLayout? = null
    private val menu = arrayOf("asahi", "chikara","daichi","kei","nishinoya","ryuu","shoyo","sugarawa","tadashi","tobio")
    private val gambar = intArrayOf(R.drawable.asahi,R.drawable.chikara,R.drawable.daichi,R.drawable.kei,R.drawable.nishinoya,R.drawable.ryuu,R.drawable.shoyo,R.drawable.sugawara,R.drawable.tadashi,R.drawable.tobio)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        linearLayout = findViewById(R.id.linear1)
        val layoutInflater = LayoutInflater.from(this)

        for(i in menu.indices){
            val view: View =layoutInflater.inflate(R.layout.layout_utama,linearLayout, false)
            val imageView  = view.findViewById<ImageView>(R.id.iv)
            imageView.setImageResource(gambar[i])
            val tv = view.findViewById<TextView>(R.id.tv)
            tv.text = menu[i]
            linearLayout?.addView(view)
        }
    }
}

