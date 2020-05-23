package com.liondy.kotlinteksmerger

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private var text1: EditText? = null
    private var text2: EditText? = null
    private var hasil: TextView? = null
    private var btnMerge: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        text1 = findViewById<View>(R.id.text1) as EditText
        text2 = findViewById<View>(R.id.text2) as EditText
        hasil = findViewById<View>(R.id.hasil) as TextView
        btnMerge = findViewById<View>(R.id.btnMerge) as Button
        btnMerge!!.setOnClickListener {
            hasil!!.text = text1!!.text.toString() + " " + text2!!.text
            text1!!.setText("")
            text2!!.setText("")
        }
    }
}