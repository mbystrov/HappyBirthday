package com.example.happybirthday

import android.app.Application
import ru.rustore.sdk.pushclient.RuStorePushClient

class App : Application() {
    override fun onCreate() {
        RuStorePushClient.init(
            application = this,
            projectId = "token",
            logger =VkMyOwnLogger("tag")
        )
    }
}