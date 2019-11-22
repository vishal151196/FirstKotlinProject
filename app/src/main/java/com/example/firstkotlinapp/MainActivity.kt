package com.example.firstkotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
        fun toast(view: View){
            Toast.makeText(this,textView.text.toString() , Toast.LENGTH_SHORT).show()
        }
        fun count(view: View){
            var value = Integer.parseInt(textView.text.toString())
            value+=1
            textView.text= ""+ value
        }
    fun random(view: View){
        val random = (0..6).random()
        textView.text= ""+ random
        Toast.makeText(this,"CURRENT RANDOM NUMBER: "+textView.text.toString() , Toast.LENGTH_SHORT).show()


    }
}
