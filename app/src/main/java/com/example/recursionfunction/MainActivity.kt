package com.example.recursionfunction

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        main3(7)
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

    // 10진수 숫자를 입력받아서 2진수 문자열로 변환하는 함수를 작성
    var arr = ""
    fun main3(n : Int) {
        arr += n%2
        if (n == 1) return
        return main3(n/2)
    }
}