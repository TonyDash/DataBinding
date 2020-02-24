package com.example.cjy.databinding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.cjy.databinding.bean.User
import com.example.cjy.databinding.databinding.ActivityListBinding

class ListActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)
        val activityListBinding:ActivityListBinding =
            DataBindingUtil.setContentView(this,R.layout.activity_list)
        val userList:List<User> = mutableListOf(User("chen JY",33),
            User("luo YZ",30),
            User("chen YR",2))
        activityListBinding.userList = userList
        activityListBinding.index = 1
    }
}