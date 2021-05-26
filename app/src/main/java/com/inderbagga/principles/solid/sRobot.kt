package com.inderbagga.principles.solid

//decoupling the entity from its presentation logic
data class sRobot(val name:String, val type:String)

class Communicate{

    fun intro(self:sRobot){
        println("This is ${self.name}, and I am a ${self.type}.")
    }
}
