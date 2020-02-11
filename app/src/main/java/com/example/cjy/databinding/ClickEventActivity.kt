package com.example.cjy.databinding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.cjy.databinding.clickevent.ButtonClickEvent
import com.example.cjy.databinding.databinding.ActivityClickEventBinding

class ClickEventActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_click_event)
        val bindingClick:ActivityClickEventBinding = DataBindingUtil.setContentView(this,R.layout.activity_click_event)
        bindingClick.clickEvent = ButtonClickEvent()
    }
}