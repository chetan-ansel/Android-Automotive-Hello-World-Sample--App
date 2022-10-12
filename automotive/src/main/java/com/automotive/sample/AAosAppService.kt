package com.automotive.sample

import android.content.Intent
import androidx.car.app.CarAppService
import androidx.car.app.Screen
import androidx.car.app.Session
import androidx.car.app.validation.HostValidator

/**
 * A aos app service
 *
 * @constructor Create empty A aos app service
 */
class AAosAppService : CarAppService() {
    override fun createHostValidator(): HostValidator {

        return HostValidator.ALLOW_ALL_HOSTS_VALIDATOR
    }

    override fun onCreateSession(): Session {
        return object : Session() {

            override fun onCreateScreen(intent: Intent): Screen {
                return AAosScreen(carContext)
            }

        }
    }

}
