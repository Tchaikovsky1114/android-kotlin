package com.example.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button as Button


class MainActivity : AppCompatActivity() { // MainActivity -> AppCompatActivity -> Activity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        settingButton()
    }

    fun settingButton() {
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            // subactivity로 이동
            // intent : 어떤 것을 하고 싶은지 의도를 나타내는 객체
            val intent = Intent(this, SubActivity::class.java)
            startActivity(intent)
        }
    }
}