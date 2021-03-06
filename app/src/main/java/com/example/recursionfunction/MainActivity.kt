package com.example.recursionfunction

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlin.math.max
import kotlin.math.min

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println(gdc(16,40,1))
    }

    // 최대공약수를 구하는 gdc 함수를 작성해 보자.
    fun gdc(a : Int , b : Int, num : Int) : Int {
            for (i in min(a,b) downTo 1) {
                if (a%i == 0 && b%i == 0) {
                    return gdc(a%i, b%i, num*i)
                }
            }
        return num
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

    // 입력값 n이 리스트에 존재하는지 확인하는 함수를 재귀로 구현해보자
    fun main4(n : String, list : List<String>) : Boolean {
        if (list[0] == n) return true
        return main4(n, list.drop(1))
    }
}