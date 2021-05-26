package com.inderbagga.principles.solid.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.inderbagga.principles.*
import com.inderbagga.principles.solid.*

class OpenClosedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val marriot= Marriot()
        val mahindra= Mahindra()

        val hotelUnion= HotelUnion(listOf(marriot,mahindra))

        hotelUnion.calculateSales().let {

            println("Total Union Sales are worth INR $it.")
        }

        //Showcasing  Open and Closed Principal
        val taj= Taj(dHotel(1250,9F,0))
        val oyo= Oyo(dHotel(1000,0F,0))
        val hyatt= Hyatt(dHotel(1250,9F,300))

        //today's occupancy numbers
        taj.occupants=3
        oyo.occupants=2
        hyatt.occupants=1

        val hotelAssociation= HotelAssociation(listOf(taj,oyo,hyatt))

        hotelAssociation.getDailySales().let {

            println("Total Association Sales are worth INR $it.")
        }
    }
}