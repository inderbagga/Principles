package com.inderbagga.principles.solid.invalid


/*Firstly, it’s representing our Robot entity and holding state for a name and type.
secondly, it’s concerned with how our robot is communicating.*/
class Robot(val name: String, val type: String) {

    fun communicate() {
        println("Hello my name is $name, and I am a $type robot")
    }
}