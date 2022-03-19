package com.notes

import android.app.Application
import com.notes.di.AppComponent
import com.notes.di.DaggerAppComponent

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent.builder().bindsApplication(this).build()
    }

    companion object{

        lateinit var appComponent: AppComponent
    }
}