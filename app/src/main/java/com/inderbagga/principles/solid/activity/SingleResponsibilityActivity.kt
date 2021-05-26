package com.inderbagga.principles.solid.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.inderbagga.principles.Robot
import com.inderbagga.principles.solid.*

class SingleResponsibilityActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val averageRobot= Robot("Dodo","Robot")
        averageRobot.communicate()

        //Showcasing Single Responsibility Principal
        val smartRobot= sRobot("Alita","Battle Angel")

        Communicate().intro(smartRobot)
    }
}