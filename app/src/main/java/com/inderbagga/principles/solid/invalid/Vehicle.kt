package com.inderbagga.principles.solid.invalid

abstract class Vehicle {

    protected var isEngineRunning=false
    abstract fun startEngine()
    abstract fun stopEngine()
    abstract fun moveForward()
    abstract fun moveBackward()
}

class Car : Vehicle(){
    override fun startEngine() {
        super.isEngineRunning=true
        println("Engine started.")
    }

    override fun stopEngine() {
        super.isEngineRunning=false
        println("Engine stopped.")
    }

    override fun moveForward() {
        println("Moving forward.")
    }

    override fun moveBackward() {
        println("Moving backward.")
    }
}

class Bicycle : Vehicle(){
    override fun startEngine() {
        println("LSP fails: No Engine Found!")
    }

    override fun stopEngine() {
        println("LSP fails: No Engine Found!")
    }

    override fun moveForward() {
        println("Moving forward.")
    }

    override fun moveBackward() {
        println("Moving backward.")
    }

}