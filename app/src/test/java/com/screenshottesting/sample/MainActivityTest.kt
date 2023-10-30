package com.screenshottesting.sample

import androidx.constraintlayout.widget.ConstraintLayout
import app.cash.paparazzi.DeviceConfig.Companion.PIXEL_3
import app.cash.paparazzi.Paparazzi
import org.junit.Rule
import org.junit.Test

class MainActivityTest {

    @get:Rule
    val paparazzi = Paparazzi(deviceConfig = PIXEL_3)

    @Test
    fun pixel3() {
        val launch = paparazzi.inflate<ConstraintLayout>(R.layout.activity_main)
        paparazzi.snapshot(launch)
    }

}