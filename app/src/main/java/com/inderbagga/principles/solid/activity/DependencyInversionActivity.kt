package com.inderbagga.principles.solid.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.inderbagga.principles.solid.*
import com.inderbagga.principles.solid.invalid.*

class DependencyInversionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val pub= Pub()
        pub.dispense()

        val androidDeveloper = AndroidDeveloper()
        val iosDeveloper = IosDeveloper()

        androidDeveloper.developMobileApp()
        iosDeveloper.developMobileApp()

        //Using Dependency Inversion Principle
        val beer= DBeer()
        val wine= DWine()

        val dPub= DPub(listOf(beer,wine))
        dPub.dispense()

        val developers = arrayListOf(DAndroidDeveloper(DAndroidDeveloper.MobileServices.HMS), DIosDeveloper())
        developers.forEach { developer ->
            developer.developMobileApp()
        }

    }

}