package com.inderbagga.principles.solid

enum class TYPE {
    FAST_FOOD, DESSERT, INDIAN, CHINESE
}

interface IFood {
    fun name(): String
    fun type(): TYPE
}

interface HotFood :IFood{
    fun boil() : String
}

interface ColdFood :IFood {
    fun freeze(): String
}

class IIceCream : ColdFood{
    override fun name(): String = "Vanilla Ice Cream"

    override fun type(): TYPE = TYPE.DESSERT

    override fun freeze(): String = "Freezing"
}

class INoodles : HotFood{
    override fun name(): String = "Hakka Noodles"

    override fun type(): TYPE = TYPE.FAST_FOOD

    override fun boil(): String = "Boiling"
}