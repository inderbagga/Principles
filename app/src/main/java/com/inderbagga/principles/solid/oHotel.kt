package com.inderbagga.principles.solid

//This means dependent classes on oHotel need not change, when we create new classes derived from oHotel.
interface oHotel {
    fun getPrice():Int

    var occupants: Int
}

class Oyo(val dHotel:dHotel) : oHotel{

    override var occupants: Int = 0

    override fun getPrice(): Int =
        dHotel.basePrice
}

class Taj(val dHotel:dHotel) : oHotel{

    override fun getPrice(): Int =
        dHotel.basePrice + ((dHotel.basePrice*dHotel.gst)/100).toInt()

    override var occupants: Int =0
}

class Hyatt(val dHotel:dHotel) : oHotel{

    override fun getPrice(): Int =
        dHotel.basePrice + ((dHotel.basePrice*dHotel.gst)/100).toInt() + dHotel.parkFee

    override var occupants: Int = 0
        get() = field
        set(value) {field=value}

}

data class dHotel(val basePrice:Int,val gst:Float,val parkFee:Int)

class HotelAssociation(val hotels:List<oHotel>){

    fun getDailySales(): Int{

        var totalPrice=0

        hotels.forEach {
            totalPrice +=it.getPrice()*it.occupants
        }

        return totalPrice
    }
}