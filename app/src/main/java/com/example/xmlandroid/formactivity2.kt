package com.example.xmlandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class formactivity2 : AppCompatActivity() {
    //declare avariable
    lateinit var feedback: Button
    lateinit var pay:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formactivity2)
        //finding view by id
        feedback=findViewById(R.id.button4)
        pay=findViewById(R.id.pay)
        //set on click listener
        feedback.setOnClickListener {
            var feed=Intent(this,buttonactivity::class.java)
            startActivity(feed)
        }
        //stk
        pay .setOnClickListener {
            val simToolKitLaunchIntent=applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")
            simToolKitLaunchIntent?.let { startActivity(it) }
        }


    }
}