package com.example.testapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        simpleAdd()
        emailCheck()
        numberCheck()

    }

    fun simpleAdd() = with(binding) {
        btnPlus.setOnClickListener {
            tvResult.text = (edtOne.text.toString().toInt() + edtTwo.text.toString().toInt()).toString()
        }
    }

    fun emailCheck() = with(binding) {
        btnEmail.setOnClickListener {
            val result = Math().checkEmail(edtEmail.text.toString())
            tvResult.text = result.toString()
        }
    }

    fun numberCheck() = with(binding) {
        btnNumber.setOnClickListener {
            val result = Math().checkNumber(edtNumber.text.toString())
            tvResult.text = result.toString()
        }
    }
}