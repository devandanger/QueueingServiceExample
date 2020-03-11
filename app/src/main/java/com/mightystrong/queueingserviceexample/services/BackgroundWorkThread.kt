package com.mightystrong.queueingserviceexample.services

import android.util.Log

class BackgroundWorkThread(val guid: String): Thread() {
    override fun run() {
        super.run()
        Log.d("Background service", "Thread work started $guid")
        Thread.sleep(5000)
        Log.d("Background service", "Thread work finished $guid")
    }
}