package com.inderbagga.principles.solid

import com.inderbagga.principles.solid.invalid.MobilePhone

class OMobilePhoneUser{
    fun runMobileDevice(mobileServices: OMobileServices, mobilePhone: MobilePhone){
        println("The ${mobilePhone.brandName} is running after activating ${mobileServices.activateSIM()} SIM.")
    }
}

interface OMobileServices{

    fun activateSIM():String

    fun addMobileServiceToPhone(mobilePhone: MobilePhone)
}

class SmartMobileServices(val name:String): OMobileServices{
    override fun activateSIM() :String=name

    override fun addMobileServiceToPhone(mobilePhone: MobilePhone){ println("$name Mobile Services have been added in ${mobilePhone.brandName}") }
}