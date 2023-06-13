package com.example.xmlandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class buttonactivity : AppCompatActivity() {
    lateinit var intent: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buttonactivity)

        intent=findViewById(R.id.btn6)


        intent.setOnClickListener {
            var intent= Intent(this,intentActivity::class.java)
            startActivity(intent)


        }
}}