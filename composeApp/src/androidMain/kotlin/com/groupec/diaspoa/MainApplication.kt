package com.groupec.diaspoa

import android.app.Application
import com.groupec.sampleapp.di.initializeKoin
import org.koin.android.ext.koin.androidContext

class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        initializeKoin(
            config = { androidContext(this@MainApplication) }
        )
    }
}