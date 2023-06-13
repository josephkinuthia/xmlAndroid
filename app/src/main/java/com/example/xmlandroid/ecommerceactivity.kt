package com.example.xmlandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

lateinit var stk: Button
class ecommerceactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //finding an id
        setContentView(R.layout.activity_ecommerceactivity)
        stk=findViewById(R.id.BtnStk)

        //stk
        stk.setOnClickListener {
            val simToolKitLaunchIntent=applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")
            simToolKitLaunchIntent?.let { startActivity(it) }
        }
    }
}