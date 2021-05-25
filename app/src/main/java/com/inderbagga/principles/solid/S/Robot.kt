package com.inderbagga.principles.solid.S


class Robot(val name: String, val type: String) {

    fun greet() {
        println("Hello my name is $name, and I am a $type robot")
    }
}