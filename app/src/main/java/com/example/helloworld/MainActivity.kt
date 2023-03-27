package com.example.helloworld


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class MainActivity : AppCompatActivity() { // MainActivity -> AppCompatActivity -> Activity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.edittext)

    }

}

// 레이아웃 - 뷰 그룹의 일종으로 다른 뷰/레이아웃을 배치시키는 역할을 한다.
// 1. 리니어 레이아웃 - 위에서 아래로 차례로 정렬
// 2. 상대적 레이아웃 - 부모 레이아웃, 다른 뷰를 기준으로 상대적으로 위치시킴
// 3. 컨스트레인트 레이아웃 - 각각 수직, 수평 방향에 제약을 주어 위치시킨다.
// 4. 테이블 레이아웃 - 앨범과 같이 뷰를 정렬
// 5. 프레임 레이아웃 - 뷰들을 액자처럼 쌓아둠 가장 나중에 배치된게 상단표시. 보통 하나의 레이아웃으로 디자인 처리할때 쓰임.
