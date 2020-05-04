package com.example.cjy.databinding.bean

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable

class Student :BaseObservable(){
    @get:Bindable
    var name:String? = ""
    @get:Bindable
    var age:Int = 0
    @get:Bindable
    var classRoom:Int = 0
    @get:Bindable
    var introduce:String? = ""
}