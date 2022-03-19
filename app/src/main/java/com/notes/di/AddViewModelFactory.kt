package com.notes.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.notes.data.NoteDatabase
import com.notes.ui.add.NoteAddViewModel
import javax.inject.Inject
import javax.inject.Named
import javax.inject.Scope

class AddViewModelFactory @Inject constructor(
    private val noteDatabase: NoteDatabase
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        require(modelClass == NoteAddViewModel::class.java)
        return NoteAddViewModel(noteDatabase) as T
    }

    @AddScope
    @Named("Detail")
    interface Factory {
        fun create(): AddViewModelFactory
    }
}

@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class AddScope