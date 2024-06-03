package com.example.communicationbetweenfragments

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var fragmentA: FragmentA
    private lateinit var fragmentB: FragmentB

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fragmentA = supportFragmentManager.findFragmentById(R.id.fragment1)as FragmentA
        fragmentB = supportFragmentManager.findFragmentById(R.id.fragment2)as FragmentB
    }

     fun setDataToFragmentA(text : String){
        fragmentA.text = text

    }
     fun setDataToFragmentB(text : String){
        fragmentB.text1 = text

    }
}