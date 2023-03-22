package com.example.testapp

import androidx.core.util.PatternsCompat

class Math {

    fun plus(a : String, b: String) : String {
        var result = ""
        if (a.isEmpty() || b.isEmpty()) {
            result = "Одно из полей является пустыми"
        } else if (a.contains(".") || b.contains(".")) {
            val numberA = a.toDouble()
            val numberB = b.toDouble()
            result = (numberA + numberB).toString()
        } else if (a.toIntOrString() || b.toIntOrString()){
            val numberA = a.toInt()
            val numberB = b.toInt()
            result = (numberA + numberB).toString()
        } else {
            result = "Нельзя сложить буквы"
        }
        return result
    }

    fun checkEmail(email : String) : Boolean {
        return PatternsCompat.EMAIL_ADDRESS.matcher(email).matches()
    }

    fun checkNumber(number: String) :Boolean {
        return number.length == 9 && number.toIntOrString()
    }


    fun String.toIntOrString(): Boolean {
        val v = this.toIntOrNull()
        return when(v) {
            null -> false
            else -> true
        }
    }
}