package com.example.kotlin_hm_n2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lateinit var result: TextView

        val btnSum = findViewById<Button>(R.id.btnSum)
        val btnSubtraction = findViewById<Button>(R.id.btnSubtraction)
        val btnMultiply = findViewById<Button>(R.id.btnMultiply)
        val btnDivide = findViewById<Button>(R.id.btnDivide)
        var firstNum: EditText = findViewById(R.id.firstNum)
        var secNum: EditText = findViewById(R.id.secNum)


        fun changeActivity() {
            val intent = Intent(this, NewActivity::class.java)
            startActivity(intent)
        }

        fun resultSum(){
            val n1 = firstNum.text.toString().toDouble()
            val n2 = secNum.text.toString().toDouble()
            result = findViewById(R.id.result)
            val res = n1+n2
            result.text = res.toString()
        }
        fun resultSubtraction(){
            val n1 = firstNum.text.toString().toDouble()
            val n2 = secNum.text.toString().toDouble()
            result = findViewById(R.id.result)
            val res = n1-n2
            result.text = res.toString()
        }
        fun resultMultiply(){
            val n1 = firstNum.text.toString().toDouble()
            val n2 = secNum.text.toString().toDouble()
            result = findViewById(R.id.result)
            val res = n1*n2
            result.text = res.toString()
        }
        fun resultDivide(){
            val n1 = firstNum.text.toString().toDouble()
            val n2 = secNum.text.toString().toDouble()
            result = findViewById(R.id.result)
            val res = n1/n2
            result.text = res.toString()
        }
        
        btnSum.setOnClickListener {
            changeActivity()
            resultSum()
        }
        btnSubtraction.setOnClickListener {
            changeActivity()
            resultSubtraction()
        }
        btnMultiply.setOnClickListener {
            changeActivity()
            resultMultiply()
        }
        btnDivide.setOnClickListener {
            changeActivity()
            resultDivide()
        }

    }
}