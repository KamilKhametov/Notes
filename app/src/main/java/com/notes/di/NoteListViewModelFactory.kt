package com.notes.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.notes.data.NoteDatabase
import com.notes.ui.list.NoteListViewModel
import javax.inject.Inject
import javax.inject.Named
import javax.inject.Scope

class NoteListViewModelFactory @Inject constructor(
    private val noteDatabase: NoteDatabase
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        require(modelClass == NoteListViewModel::class.java)
        return NoteListViewModel(noteDatabase) as T
    }

    @ListScope
    @Named("List")
    interface Factory {
        fun create(): NoteListViewModelFactory
    }
}

@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class ListScope