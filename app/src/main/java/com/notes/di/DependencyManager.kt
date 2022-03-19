package com.notes.di

import android.app.Application

//class DependencyManager private constructor(
//    application: Application
//) {
//
//    private val appComponent = DaggerAppComponent.factory().create(application)
//
//    private val rootComponent = DaggerRootComponent.factory().create(appComponent)
//
//    companion object {
//        private lateinit var instance: DependencyManager
//
//        fun init(application: Application) {
//            instance = DependencyManager(application)
//        }
//
//
//        fun noteListViewModel() = instance.rootComponent.getNoteListViewModel()
//
//        fun noteDetailsViewModel() = instance.rootComponent.getNoteDetailViewModel()
//
//        fun noteAddViewModel() = instance.rootComponent.getNoteAddViewModel()
//    }
//}
