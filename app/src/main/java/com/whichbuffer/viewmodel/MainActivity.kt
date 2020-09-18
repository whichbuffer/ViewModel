package com.whichbuffer.viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),LifecycleOwner {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)
        button.setOnClickListener{
            viewModel.addNumber()
            textView.text = viewModel.number.toString()
        }


        /* Without View Model
        var number= 0
        button.setOnClickListener {
            number++
            textView.text = number.toString()
        }*/


    }
}