package com.notes.di

import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import javax.inject.Named

@Module
abstract class ViewModelModule {

    @Binds
    @Named("Detail")
    abstract fun bindNoteDetailsViewModelFactory(factory: DetailViewModelFactory) : ViewModelProvider.Factory

    @Binds
    @Named("Add")
    abstract fun bindNoteAddViewModelFactory(factory: AddViewModelFactory) : ViewModelProvider.Factory

    @Binds
    @Named("List")
    abstract fun bindNoteListViewModelFactory(factory: NoteListViewModelFactory) : ViewModelProvider.Factory
}