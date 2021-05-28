package com.inderbagga.principles.solid

interface Drink{

    fun dispense()
}

//Low level classes depends on interface
class DBeer : Drink {override fun dispense(){println("dispense beer!")}}
class DWine: Drink {override fun dispense(){println("dispense wine!")}}

//high level class depends on interface
class DPub(private val drink:List<Drink>) {


    fun dispense(){

       drink.forEach {
           print(it.dispense())
       }
    }
}

interface MobileDeveloper{
    fun developMobileApp()
}

class DAndroidDeveloper(var mobileService: MobileServices): MobileDeveloper{
    override fun developMobileApp(){
        println("Developing Android Application by using Kotlin. " +
                "Application will work with ${mobileService.serviceName}")
    }
    enum class MobileServices(var serviceName: String){
        HMS("Huawei Mobile Services"),
        GMS("Google Mobile Services"),
        BOTH("Huawei Mobile Services and Google Mobile Services")
    }
}

class DIosDeveloper: MobileDeveloper{
    override fun developMobileApp(){
        println("Developing iOS Application by using Swift")
    }
}