package com.example.zuritask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Button:Button=findViewById(R.id.button)
        val numbers:TextView=findViewById(R.id.textView)
        Button.setOnClickListener(View.OnClickListener {
            var ans:Int?=increment(numbers)
            numbers.setText(ans.toString())
        })
    }

    fun increment(number: TextView): Int? {

        var num: Int? = number.text.toString().toIntOrNull()
        num = num?.plus(1)
        return num
    }
}