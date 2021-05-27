package com.inderbagga.principles.solid.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.inderbagga.principles.solid.*
import com.inderbagga.principles.solid.invalid.*

class LiskovSubstitutionActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Before Applying Liskov Substitution Principle
        val eagle=Eagle()
        eagle.fly()
        eagle.makeSound()

        val penguin= Penguin()
        penguin.fly()
        penguin.makeSound()

        val kangaroo= Kangaroo()
        kangaroo.jump()
        kangaroo.goToLocation()

        val elephant= Elephant()
        elephant.jump()
        elephant.goToLocation()

        //After Applying Liskov Substitution Principle
        val lEagle= LEagle()
        lEagle.fly()
        lEagle.makeSound()

        val lKangaroo= LKangaroo()
        lKangaroo.jump()
        lKangaroo.goToLocation()

        val lElephant= LElephant()
        lElephant.goToLocation()

        val lPenguin= LPenguin()
        lPenguin.makeSound()
    }
}