package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TwoColorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two_color)
        settingButtons()
    }

    fun settingButtons() {
        val buttonRed = findViewById<Button>(R.id.button_red_fragment)
        val buttonBlue = findViewById<Button>(R.id.button_blue_fragment)

        buttonRed.setOnClickListener(){
            val fragmentTransection = supportFragmentManager.beginTransaction()
            fragmentTransection.replace(R.id.frame_layout,RedFragment())
            fragmentTransection.commit()
        }
        buttonBlue.setOnClickListener(){
            val fragmentTransection = supportFragmentManager.beginTransaction()
            fragmentTransection.replace(R.id.frame_layout,BlueFragment())
            fragmentTransection.commit()
        }
    }
}