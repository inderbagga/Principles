package com.inderbagga.principles.solid.invalid

//Low level classes
class Beer{fun dispense(){println("dispense beer!")}}

class Wine{fun dispense(){println("dispense wine!")}}

//high level classes
class Pub {

    val beer=Beer()
    val wine=Wine()

    fun dispense(){

        beer.dispense()
        wine.dispense()
    }
}

class AndroidDeveloper{
    fun developMobileApp(){
        println("Developing Android Application by using Kotlin")
    }
}

class IosDeveloper{
    fun developMobileApp(){
        println("Developing iOS Application by using Swift")
    }
}