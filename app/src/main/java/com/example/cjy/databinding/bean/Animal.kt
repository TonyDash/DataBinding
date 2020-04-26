package com.example.cjy.databinding.bean

import androidx.databinding.ObservableField
import androidx.databinding.ObservableInt

class Animal(){
    val nickName = ObservableField<String>()
    val age = ObservableInt()
}