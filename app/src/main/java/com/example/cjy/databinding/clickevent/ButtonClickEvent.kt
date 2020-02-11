package com.example.cjy.databinding.clickevent

import android.view.View
import android.widget.Toast
import com.example.cjy.databinding.R

class ButtonClickEvent {
    fun click(view:View){
        when(view.id){
            R.id.btn_click1->{
                Toast.makeText(view.context,"button click 1!",Toast.LENGTH_SHORT).show()
            }
        }
    }
    fun click(){

    }
}