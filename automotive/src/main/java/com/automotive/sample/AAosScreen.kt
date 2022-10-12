package com.automotive.sample

import androidx.car.app.CarContext
import androidx.car.app.Screen
import androidx.car.app.model.*

/**
 * AAos screen
 *
 * @constructor
 *
 * @param carContext
 */
class AAosScreen(carContext: CarContext) : Screen(carContext) {
    override fun onGetTemplate(): Template {
        val row: Row = Row.Builder().setTitle("Welcome to Android Automotive!").build()
        return PaneTemplate.Builder(
            Pane.Builder()
                .addRow(row)
                .build()
        ).setHeaderAction(Action.APP_ICON).setTitle("Automotive Hello World")
            .setActionStrip(ActionStrip.Builder()
                .addAction(Action.Builder().setTitle("Settings").build()).build()).build()
    }
}
