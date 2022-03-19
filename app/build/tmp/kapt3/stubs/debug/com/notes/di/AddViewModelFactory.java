package com.notes.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u000bB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J%\u0010\u0005\u001a\u0002H\u0006\"\b\b\u0000\u0010\u0006*\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00060\tH\u0016\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/notes/di/AddViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "noteDatabase", "Lcom/notes/data/NoteDatabase;", "(Lcom/notes/data/NoteDatabase;)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "Factory", "app_debug"})
public final class AddViewModelFactory implements androidx.lifecycle.ViewModelProvider.Factory {
    private final com.notes.data.NoteDatabase noteDatabase = null;
    
    @javax.inject.Inject
    public AddViewModelFactory(@org.jetbrains.annotations.NotNull
    com.notes.data.NoteDatabase noteDatabase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull
    java.lang.Class<T> modelClass) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/notes/di/AddViewModelFactory$Factory;", "", "create", "Lcom/notes/di/AddViewModelFactory;", "app_debug"})
    @javax.inject.Named(value = "Detail")
    @AddScope
    public static abstract interface Factory {
        
        @org.jetbrains.annotations.NotNull
        public abstract com.notes.di.AddViewModelFactory create();
    }
}