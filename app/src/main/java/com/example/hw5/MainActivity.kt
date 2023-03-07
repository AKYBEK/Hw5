package com.example.hw5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val numbers: MutableList<Int> = mutableListOf(9, 0, 2, 3, 4, 5, 11, 10, 20)
        val num1: MutableList<Int> = mutableListOf()
        val num2: MutableList<Int> = mutableListOf()
        for (i in numbers) {
            if (i % 2 == 0) {
                num1.add(i)
            } else {
                num2.add(i)
            }
        }
        println(num1)
        println(num2)
    }

}