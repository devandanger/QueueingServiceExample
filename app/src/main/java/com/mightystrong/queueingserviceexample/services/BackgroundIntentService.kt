package com.mightystrong.queueingserviceexample.services

import android.app.IntentService
import android.content.Intent
import android.util.Log
import java.util.*

class BackgroundIntentService : IntentService("BackgroundIntentService") {
    override fun onHandleIntent(p0: Intent?) {
        syncTask()
    }
    private fun syncTask() {
        val guid = UUID.randomUUID().toString()
        Log.d("Background service", "OnHandleStart $guid")
        Log.d("Background service", "Thread work started $guid")
        Thread.sleep(5000)
        Log.d("Background service", "Thread work finished $guid")
        Log.d("Background service", "OnHandleFinish $guid")
    }
    private fun asyncTask() {
        val guid = UUID.randomUUID().toString()
        Log.d("Background service", "OnHandleStart $guid")
        val workThread = BackgroundWorkThread(guid)
        workThread.start()

        Log.d("Background service", "OnHandleFinish $guid")
    }

}