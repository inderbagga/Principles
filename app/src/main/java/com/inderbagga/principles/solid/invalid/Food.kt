package com.inderbagga.principles.solid.invalid

enum class TYPE {
    FAST_FOOD, DESSERT, INDIAN, CHINESE
}

interface Food {
    fun name(): String
    fun type(): TYPE
    fun boil() : String
    fun freeze(): String
}

class IceCream : Food{
    override fun name(): String = "Vanilla Ice Cream"

    override fun type(): TYPE = TYPE.DESSERT

    override fun boil(): String {
        TODO("Failed Interface Segragation Principle.")
    }

    override fun freeze(): String = "Freezing"

}

class Noodles : Food{
    override fun name(): String = "Hakka Noodles"

    override fun type(): TYPE = TYPE.FAST_FOOD

    override fun boil(): String = "Boiling"

    override fun freeze(): String {
        TODO("Failed Interface Segragation Principle.")
    }

}