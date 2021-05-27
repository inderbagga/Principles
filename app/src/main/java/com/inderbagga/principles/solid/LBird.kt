package com.inderbagga.principles.solid

open class LBird {

    open fun makeSound(){}
}

open class LFlyBird :LBird() {

    open fun fly(){}
}

class LEagle : LFlyBird()
{
    override fun fly(){super.fly()}
    override fun makeSound(){super.makeSound()}
}

class LPenguin : LBird()
{
    override fun makeSound(){super.makeSound()}
}