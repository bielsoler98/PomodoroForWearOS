package com.senyor_o.pomodoro.utils

import java.util.concurrent.TimeUnit


object Utility {

    const val DATABASE_NAME = "settings_database"

    //time to countdown - 1hr - 60secs
    private const val TIME_FORMAT = "%02d:%02d"

    const val CHANNEL_ID = "com.senyor_o.pomodoro.channel"
    const val WORK = "Work"
    const val SHORT_BREAK = "Short break"
    const val LONG_BREAK = "Long break"


    //convert time to milli seconds
    fun Long.formatTime(): String = String.format(
        TIME_FORMAT,
        TimeUnit.MILLISECONDS.toMinutes(this),
        TimeUnit.MILLISECONDS.toSeconds(this) % 60
    )

}