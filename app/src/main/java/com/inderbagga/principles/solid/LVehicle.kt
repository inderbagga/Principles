package com.inderbagga.principles.solid

interface LVehicle {

    fun moveForward()
    fun moveBackward()
}

abstract class EnginePoweredVehicle :LVehicle{

    protected var isEngineRunning=false
    abstract fun startEngine()
    abstract fun stopEngine()
}

class LCar : EnginePoweredVehicle(){
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

class LBicycle : LVehicle{

    override fun moveForward() {
        println("Moving forward.")
    }

    override fun moveBackward() {
        println("Moving backward.")
    }

}