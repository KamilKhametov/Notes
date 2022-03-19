package com.notes.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\bH\'J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\nH\'\u00a8\u0006\u000b"}, d2 = {"Lcom/notes/di/ViewModelModule;", "", "()V", "bindNoteAddViewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "factory", "Lcom/notes/di/AddViewModelFactory;", "bindNoteDetailsViewModelFactory", "Lcom/notes/di/DetailViewModelFactory;", "bindNoteListViewModelFactory", "Lcom/notes/di/NoteListViewModelFactory;", "app_debug"})
@dagger.Module
public abstract class ViewModelModule {
    
    public ViewModelModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Named(value = "Detail")
    @dagger.Binds
    public abstract androidx.lifecycle.ViewModelProvider.Factory bindNoteDetailsViewModelFactory(@org.jetbrains.annotations.NotNull
    com.notes.di.DetailViewModelFactory factory);
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Named(value = "Add")
    @dagger.Binds
    public abstract androidx.lifecycle.ViewModelProvider.Factory bindNoteAddViewModelFactory(@org.jetbrains.annotations.NotNull
    com.notes.di.AddViewModelFactory factory);
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Named(value = "List")
    @dagger.Binds
    public abstract androidx.lifecycle.ViewModelProvider.Factory bindNoteListViewModelFactory(@org.jetbrains.annotations.NotNull
    com.notes.di.NoteListViewModelFactory factory);
}