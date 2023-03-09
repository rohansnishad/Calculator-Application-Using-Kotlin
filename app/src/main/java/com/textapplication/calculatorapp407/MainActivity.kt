package com.textapplication.calculatorapp407

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : Activity(), View.OnClickListener {

    lateinit var firstNumber : EditText
    lateinit var secondNumber : EditText
    lateinit var tvResult : TextView

    lateinit var btnAdd : Button
    lateinit var btnSub : Button
    lateinit var btnMul : Button
    lateinit var btnDiv : Button
    lateinit var btnClear : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        firstNumber  = findViewById(R.id.firstNumber)
        secondNumber = findViewById(R.id.secondNumber)
        tvResult     = findViewById(R.id.tvResult)
        btnAdd       = findViewById(R.id.btnAdd)
        btnSub       = findViewById(R.id.btnSub)
        btnMul       = findViewById(R.id.btnMul)
        btnDiv       = findViewById(R.id.btnDiv)
        btnClear     = findViewById(R.id.btnClear)

        btnAdd.setOnClickListener(this@MainActivity)
        btnSub.setOnClickListener(this@MainActivity)
        btnMul.setOnClickListener(this@MainActivity)
        btnDiv.setOnClickListener(this@MainActivity)
        btnClear.setOnClickListener(this@MainActivity)
    }

    override fun onClick(v: View?) {

        if(firstNumber.text.toString().isNotEmpty() && secondNumber.text.toString().isNotEmpty()) {

            var fNumber = firstNumber.text.toString().toInt()
            var sNumber = secondNumber.text.toString().toInt()
            var result = 0
            when (v?.id) {


                R.id.btnAdd -> {
                    result = fNumber + sNumber
                    tvResult.text = "${result}"
                }

                R.id.btnSub -> {
                    result = fNumber - sNumber
                    tvResult.text = "${result}"
                }
                R.id.btnMul -> {
                    result = fNumber * sNumber
                    tvResult.text = "${result}"
                        }
                R.id.btnDiv -> {

                    var fNumber = firstNumber.text.toString().toFloat()
                    var sNumber = secondNumber.text.toString().toFloat()

                    var result = fNumber / sNumber
                    tvResult.text = "${result}"
                }
                R.id.btnClear -> {

                    firstNumber.setText("")
                    secondNumber.setText("")
                    tvResult.text = "Result"
                }
            }
        }else{

            Toast.makeText(this, "Please Enter Data", Toast.LENGTH_SHORT).show()
        }


    }
}