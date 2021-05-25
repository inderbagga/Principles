package com.inderbagga.principles.solid.S


/*Firstly, it’s representing our Robot entity and holding state for a name and type.
secondly, it’s concerned with how our robot is communicating.*/
class Robot(val name: String, val type: String) {

    fun communicate() {
        println("Hello my name is $name, and I am a $type robot")
    }
}

//decoupling the entity from its presentation logic
data class iRobot(val name:String, val type:String)

class Communicate{

    fun intro(self:iRobot){
        println("This is ${self.name}, and I am a ${self.type} robot.")
    }
}