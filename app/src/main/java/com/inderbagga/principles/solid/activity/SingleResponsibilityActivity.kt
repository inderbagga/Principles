package com.inderbagga.principles.solid.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.inderbagga.principles.solid.*
import com.inderbagga.principles.solid.invalid.*

class SingleResponsibilityActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val averageRobot= Robot("Dodo","Robot")
        averageRobot.communicate()

        //Showcasing Single Responsibility Principal
        val smartRobot= SRobot("Alita","Battle Angel")

        Communicate().intro(smartRobot)
    }
}