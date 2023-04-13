package com.example.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.widget.Button
import android.widget.Toast
// AppCompatActivity를 상속 받고 있음
//엑티비티 클래스=> 하나의 화면을 정의하는데 사용되는 클래스

class MainActivity : AppCompatActivity() {
    //onCreate 라는 메서드를 오버라이드
    //onCreate 메서드에서 보통 수행하는 자겁
    //1.XML 레이아웃 파일을 이용해서 화면 구성
    //2.화면에서 사용할 데이터 초기화
    //3.뷰 객체를 통해 이벤트 리스너 등록
    override fun onCreate(savedInstanceState: Bundle?) {
        //안드로이드의 특정 메서드들을 반드시 super를
        //통해서 부모 메서드를 호출해줘야 함
        super.onCreate(savedInstanceState)
        setContentView(R.layout.welcome)

        var color = ContextCompat.getColor(this, R.color.red)
        println("color : "+color)

        var btn = findViewById<Button>(R.id.click)
        btn.setOnClickListener{
            Toast.makeText(this,"click!",Toast.LENGTH_SHORT).show()
        }
    }
}