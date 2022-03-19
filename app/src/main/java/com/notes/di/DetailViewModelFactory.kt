package com.notes.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.notes.data.NoteDatabase
import com.notes.ui.details.NoteDetailsViewModel
import javax.inject.Inject
import javax.inject.Named
import javax.inject.Scope

class DetailViewModelFactory @Inject constructor(
    private val noteDatabase: NoteDatabase
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        require(modelClass == NoteDetailsViewModel::class.java)
        return NoteDetailsViewModel(noteDatabase) as T
    }

    @DetailScope
    @Named("Detail")
    interface Factory {
        fun create(): DetailViewModelFactory
    }
}

@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class DetailScope