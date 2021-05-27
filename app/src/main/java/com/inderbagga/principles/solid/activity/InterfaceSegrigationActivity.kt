package com.inderbagga.principles.solid.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.inderbagga.principles.solid.IIceCream
import com.inderbagga.principles.solid.INoodles
import com.inderbagga.principles.solid.invalid.IceCream
import com.inderbagga.principles.solid.invalid.Noodles

class InterfaceSegrigationActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Before Applying Interface Segregation Principle
        val noodles=Noodles()
        noodles.freeze()

        val iceCream=IceCream()
        iceCream.boil()

        //After Applying Interface Segregation Principle
        val iNoodles=INoodles()
        iNoodles.boil()

        val iIceCream=IIceCream()
        iIceCream.freeze()
    }
}