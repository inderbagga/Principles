package com.inderbagga.principles.solid

abstract class LAnimal {

    abstract fun goToLocation()
}

abstract class LightAnimal : LAnimal(){

    abstract fun jump()
}

class LKangaroo : LightAnimal(){
    override fun jump() {}

    override fun goToLocation() {}

}

class LElephant : LAnimal(){

    override fun goToLocation() {}

}