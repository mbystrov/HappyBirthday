package com.example.happybirthday

import android.util.Log
import ru.rustore.sdk.pushclient.common.logger.Logger as VkLogger

internal class VkMyOwnLogger constructor(private val tag: String) : VkLogger {
    override fun createLogger(tag: String): VkLogger {
        return VkMyOwnLogger("${this.tag}:$tag")
    }

    private fun Throwable.throwableToException(): Exception {
        return if (this is Exception) {
            this
        } else {
            RuntimeException(this)
        }
    }

    override fun debug(message: String, throwable: Throwable?) {
        Log.d(tag, message, throwable?.throwableToException())
    }

    override fun error(message: String, throwable: Throwable?) {
        Log.e(tag, message, throwable)
    }

    override fun info(message: String, throwable: Throwable?) {
        Log.i(tag, message, throwable?.throwableToException())
    }

    override fun verbose(message: String, throwable: Throwable?) {
        Log.v(tag, message, throwable?.throwableToException())
    }

    override fun warn(message: String, throwable: Throwable?) {
        Log.w(tag, message, throwable?.throwableToException())
    }
}