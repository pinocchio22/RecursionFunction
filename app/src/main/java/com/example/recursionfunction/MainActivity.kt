package com.example.recursionfunction

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        main2(7)
    }

    // X의 n승을 구하는 함수를 재귀로 구현해라
    fun main1(x : Int, n : Int) : Int {
        if (n == 0) return 1
        return x * main1(x, n-1)
    }

    // n 팩터리얼을 구하는 함수를 재귀로 표현
    fun main2(n : Int) : Int {
        if (n == 0) return 1
        return n*main2(n-1)
    }
}