package com.example.xmlandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import android.widget.Toast.makeText

class MainActivity : AppCompatActivity() {
    //declairew a variable
    lateinit var toast:Button
    lateinit var info:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //finding view by id
    toast=findViewById(R.id.button)
    info=findViewById(R.id.button2)

//set on clicklistener
    toast.setOnClickListener {
        Toast.makeText(applicationContext, " welcome to zyphur retriving password click sign up to join",Toast.LENGTH_LONG).show()
     info.setOnClickListener {
        var myinfo=Intent(this,formactivity2::class.java)
         startActivity(myinfo)

     }
    }





    }}





