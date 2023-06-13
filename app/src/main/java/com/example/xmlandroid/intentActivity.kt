package com.example.xmlandroid

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button


class intentActivity : AppCompatActivity() {
    //declaring variables
    lateinit var sms:Button
    lateinit var email:Button
    lateinit var share:Button
    lateinit var camera:Button
    lateinit var stk:Button
    lateinit var call:Button
    lateinit var submit:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        //finding view by id
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)
        sms=findViewById(R.id.BtnSms)
        email=findViewById(R.id.BtnEmail)
        share=findViewById(R.id.BtnShare)
        camera=findViewById(R.id.BtnCamera)
        stk=findViewById(R.id.BtnStk)
        call=findViewById(R.id.BtnCall)
        submit=findViewById(R.id.button6)

        //sms
        sms.setOnClickListener {
            val uri = Uri.parse("sms:0717833348")
            val intent = Intent(Intent.ACTION_SENDTO, uri)
            intent.putExtra("sms_body", "hae joseph")
            startActivity(intent)
        }
        //email
        email.setOnClickListener {
            val emailIntent=Intent(Intent.ACTION_SENDTO,Uri.fromParts("mail","josephkinuthia219@gmail.com",null))
            emailIntent.putExtra(Intent.EXTRA_SUBJECT,"JOB APPLICATION")
            emailIntent.putExtra(Intent.EXTRA_TEXT,"Dear madam..")
            startActivity(Intent.createChooser(emailIntent,"Send email"))

        }
        //share
        share.setOnClickListener {
            val shareIntent=Intent(Intent.ACTION_SEND)
            shareIntent.flags=Intent.FLAG_ACTIVITY_NEW_TASK
            shareIntent.type="text/plain"
            shareIntent.putExtra(Intent.EXTRA_TEXT,"https://github.com/josephkinuthia/")
            startActivity(shareIntent)
            //camera
            camera.setOnClickListener {
                val takePictureIntent=Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                startActivityForResult(takePictureIntent,1)

            }
         //stk
            stk.setOnClickListener {
                val simToolKitLaunchIntent=applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                simToolKitLaunchIntent?.let { startActivity(it) }
            }
            //call
            call.setOnClickListener {
                val dialIntent=Intent(Intent.ACTION_DIAL)
                dialIntent.data=Uri.parse("tel:"+"0717833348")
                startActivity(dialIntent)
                //intent button
                submit.setOnClickListener {
                    var submit=Intent(this,backgroundimageActivity::class.java)
                    startActivity(submit)


                }
        }

    }
}}