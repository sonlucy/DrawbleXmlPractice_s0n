package com.example.drawblexmlpractice_s0n

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {

//        액션바에 있는 UI를 담아둘 변수
//        변수: 멤버변수 => 담아주는 행위: OonCreate
    lateinit var toastBtn : Button //나중ㅇㅔ 우리가 버튼을 담아줄거야


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        

//        기본 액션바를 불러내자.
        val defaultActionBar = supportActionBar!!

//        기본 액션바의 모드를 커스텀 지원으로 설정
        defaultActionBar.displayOptions = ActionBar.DISPLAY_SHOW_CUSTOM

//        실제로 어떤 커스텀뷰를 사용할건지?
        defaultActionBar.setCustomView(R.layout.my_custom_actionbar)

//        커스텀뷰를 들고 있는 툴바를 변수에 저장.
        val toolbar = defaultActionBar.customView.parent as Toolbar
        toolbar.setContentInsetsAbsolute(0,0)  //왼,오 여백 0
   
   
//        커스텀 액션바에 달아둔 id=toastBtn 버튼을 찾아오기
        toastBtn = defaultActionBar.customView.findViewById(R.id.toastBtn)
   
        toastBtn.setOnClickListener {
            Toast.makeText(this, "액션바를 통한 토스트", Toast.LENGTH_SHORT).show()
        }
        
    }
}