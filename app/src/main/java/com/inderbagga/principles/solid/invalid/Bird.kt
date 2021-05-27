package com.inderbagga.principles.solid.invalid

open class Bird {

    open fun fly(){}

    open fun makeSound(){}
}

class Eagle : Bird()
{
    override fun fly(){super.fly()}
    override fun makeSound(){super.makeSound()}
}

class Penguin : Bird()
{
    // fails LSP because it cannot fly therefore has different behaviour and cannot call fly() method
    override fun fly()= println("Penguins can't fly!")

    override fun makeSound(){super.makeSound()}
}