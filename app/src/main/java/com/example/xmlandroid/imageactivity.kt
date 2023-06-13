package com.example.xmlandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class imageactivity : AppCompatActivity() {
    lateinit var mixamo:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imageactivity)
        mixamo=findViewById(R.id.image1)
        mixamo.setOnClickListener {

            val mixamo1=Intent(this,backgroundimageActivity::class.java)
            startActivity(mixamo1)


    }
}}