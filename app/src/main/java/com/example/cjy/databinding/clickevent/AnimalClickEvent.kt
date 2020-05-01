package com.example.cjy.databinding.clickevent

import android.view.View
import androidx.databinding.ObservableArrayMap
import com.example.cjy.databinding.R
import com.example.cjy.databinding.bean.Animal
import kotlinx.android.synthetic.main.activity_animal.view.*

class AnimalClickEvent(private val animal:Animal,private val map:ObservableArrayMap<String,String>) {
    fun animalClick(view: View) {
        when (view.id) {
            R.id.tvAnimalNickName -> {
                animal.nickName.set("大黄")

            }
            R.id.tvAnimalAge->{
                animal.age.set(8)

            }
            R.id.tvAnimalInfo->{
                map["pat"] = "cat"
            }
        }
    }
}