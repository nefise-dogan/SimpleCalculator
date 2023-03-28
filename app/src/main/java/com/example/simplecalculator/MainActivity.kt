package com.example.simplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var numberOneEditText: EditText
    lateinit var numberTwoEditText: EditText
    lateinit var resultTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        numberOneEditText = findViewById<EditText>(R.id.numberOneEditText)
        numberTwoEditText = findViewById<EditText>(R.id.numberTwoEditText)
        resultTextView = findViewById<TextView>(R.id.resultTextView)
    }

    fun onSum (view: View) {
        val number1 = numberOneEditText.text.toString().toFloatOrNull()
        val number2 = numberTwoEditText.text.toString().toFloatOrNull()

        if (number1 == null || number2 == null) {
            resultTextView.text = "Error"
        } else {
            val result = number1 + number2
            resultTextView.text = "Result : $result"
        }
    }

    fun onSub (view: View) {
        val number1 = numberOneEditText.text.toString().toFloatOrNull()
        val number2 = numberTwoEditText.text.toString().toFloatOrNull()

        if (number1 == null || number2 == null) {
            resultTextView.text = "Error"
        } else {
            val result = number1 - number2
            resultTextView.text = "Result : $result"
        }
    }

    fun onMul (view: View) {
        val number1 = numberOneEditText.text.toString().toFloatOrNull()
        val number2 = numberTwoEditText.text.toString().toFloatOrNull()

        if (number1 == null || number2 == null) {
            resultTextView.text = "Error"
        } else {
            val result = number1 * number2
            resultTextView.text = "Result : $result"
        }
    }

    fun onDiv (view: View) {
        val number1 = numberOneEditText.text.toString().toFloatOrNull()
        val number2 = numberTwoEditText.text.toString().toFloatOrNull()

        if (number1 == null || number2 == null) {
            resultTextView.text = "Error"
        } else {
            val result = number1 / number2
            resultTextView.text = "Result : $result"
        }
    }
}