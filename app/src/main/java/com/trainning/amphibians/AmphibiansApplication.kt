package com.trainning.amphibians

import android.app.Application
import com.trainning.amphibians.data.AppContainer
import com.trainning.amphibians.data.DefaultAppContainer

class AmphibiansApplication : Application() {
    /** AppContainer instance used by the rest of classes to obtain dependencies */
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer()
    }
}