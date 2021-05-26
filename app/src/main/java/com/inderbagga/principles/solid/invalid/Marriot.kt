package com.inderbagga.principles.solid.invalid

class Marriot {

    private val basePrice=1200

    fun getPrice(): Int = basePrice
}

class Mahindra {

    private val basePrice=1600

    fun getPrice(): Int = basePrice
}


class HotelUnion(val hotels: List<Any>){

    fun calculateSales() : Int{

        var totalSales=0

        hotels.forEach {

            when(it){

              is Marriot ->  totalSales += it.getPrice()
              is Mahindra ->  totalSales += it.getPrice()
            }
        }

        return totalSales
    }
}