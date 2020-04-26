package com.example.cjy.databinding.clickevent

import android.content.Intent
import android.view.View
import com.example.cjy.databinding.AnimalActivity
import com.example.cjy.databinding.ClickEventActivity
import com.example.cjy.databinding.ListActivity
import com.example.cjy.databinding.R

class MainClickEvent {
    fun mainClick(view: View){
        when(view.id){
            R.id.btn2ClickEvent->{
                Intent(view.context,ClickEventActivity::class.java).apply {
                    view.context.startActivity(this)
                }
            }
            R.id.btn2List->{
                Intent(view.context,ListActivity::class.java).apply {
                    view.context.startActivity(this)
                }
            }
            R.id.btn2Animal->{
                Intent(view.context,AnimalActivity::class.java).apply {
                    view.context.startActivity(this)
                }
            }
        }
    }
}