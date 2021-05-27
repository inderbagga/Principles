package com.inderbagga.principles.solid.invalid

abstract class Animal {

    abstract fun jump()

    abstract fun goToLocation()
}

class Kangaroo : Animal(){

    override fun jump() {}

    override fun goToLocation() {}
}

class Elephant : Animal(){

    override fun jump() {
        println("Elephant can't jump!")
    }

    override fun goToLocation() {}

}