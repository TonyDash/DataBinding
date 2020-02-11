package com.example.cjy.databinding.clickevent

import android.content.Intent
import android.view.View
import com.example.cjy.databinding.ClickEventActivity
import com.example.cjy.databinding.R

class MainClickEvent {
    fun mainClick(view: View){
        when(view.id){
            R.id.name->{
                Intent(view.context,ClickEventActivity::class.java).apply {
                    view.context.startActivity(this)
                }
            }
        }
    }
}