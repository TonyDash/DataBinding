package com.example.cjy.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.cjy.databinding.bean.User
import com.example.cjy.databinding.clickevent.MainClickEvent
import com.example.cjy.databinding.databinding.ActivityMainBinding
import com.example.cjy.databinding.util.StringUtil

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val activityMainBinding:ActivityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        val user = User("chen jy",33)
        activityMainBinding.user = user
        activityMainBinding.clickEvent = MainClickEvent()
    }
}
