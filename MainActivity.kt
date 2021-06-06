package com.example.calculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {



   override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val etnum1=findViewById<EditText>(R.id.etnum1)
        val etnum2=findViewById<EditText>(R.id.etnum2)
        val tvAnswer=findViewById<TextView>(R.id.tvAnswer)
        val btnAdd=findViewById<Button>(R.id.btnAddition)
        val btnSubtract=findViewById<Button>(R.id.btnSubtraction)
        val btnMultiplication=findViewById<Button>(R.id.btnMultiplication)
        val btnModulous=findViewById<Button>(R.id.btnModulous)
       // val btnequalsto=findViewById<Button>(R.id.btnequalsto)

       btnAdd.setOnClickListener {
           Toast.makeText(baseContext,"Addition",Toast.LENGTH_LONG).show()
           var etnum1=etnum1.text.toString().toInt()
           var etnum2=etnum2.text.toString().toInt()
           var answer=etnum1 + etnum2

           tvAnswer.text=("$answer")
       }

       btnSubtract.setOnClickListener {
           Toast.makeText(baseContext,"subtraction",Toast.LENGTH_LONG).show()
           var etnum1=etnum1.text.toString().toInt()
           var etnum2=etnum2.text.toString().toInt()
           var answer=etnum1 - etnum2

           tvAnswer.text=("$answer")
       }

       btnMultiplication.setOnClickListener {
           Toast.makeText(baseContext,"multiplication",Toast.LENGTH_LONG).show()
           var etnum1=etnum1.text.toString().toInt()
           var etnum2=etnum2.text.toString().toInt()
           var answer=etnum1 * etnum2

           tvAnswer.text=("$answer")
       }
       btnModulous.setOnClickListener {
           Toast.makeText(baseContext,"modulous",Toast.LENGTH_LONG).show()
           var etnum1=etnum1.text.toString().toInt()
           var etnum2=etnum2.text.toString().toInt()
           var answer=etnum1 % etnum2
           tvAnswer.text=("$answer")

       }

        }



    }
