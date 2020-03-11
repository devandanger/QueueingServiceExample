package com.mightystrong.queueingserviceexample.services

import android.app.IntentService
import android.content.Intent
import android.util.Log
import java.util.*

class BackgroundIntentService : IntentService("BackgroundIntentService") {
    override fun onHandleIntent(p0: Intent?) {
        val guid = UUID.randomUUID().toString()
        Log.d("Background service", "OnHandleStart $guid")
        val workThread = BackgroundWorkThread(guid)
        workThread.start()

        Log.d("Background service", "OnHandleFinish $guid")
    }

}