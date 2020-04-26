package com.example.cjy.databinding

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.cjy.databinding.bean.Animal
import com.example.cjy.databinding.clickevent.AnimalClickEvent
import com.example.cjy.databinding.databinding.ActivityAnimalBinding

class AnimalActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animal)
        val animalBinding:ActivityAnimalBinding =
            DataBindingUtil.setContentView(this,R.layout.activity_animal)
        val dog = Animal()
        dog.nickName.set("小黄")
        dog.age.set(3)
        animalBinding.animal = dog
        animalBinding.clickEvent = AnimalClickEvent(dog)
    }
}