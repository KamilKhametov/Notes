package com.notes.ui.add;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/notes/ui/add/NoteAddViewModel;", "Landroidx/lifecycle/ViewModel;", "noteDatabase", "Lcom/notes/data/NoteDatabase;", "(Lcom/notes/data/NoteDatabase;)V", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "addNote", "", "title", "", "description", "app_debug"})
public final class NoteAddViewModel extends androidx.lifecycle.ViewModel {
    private final com.notes.data.NoteDatabase noteDatabase = null;
    private final kotlinx.coroutines.CoroutineDispatcher ioDispatcher = null;
    
    @javax.inject.Inject
    public NoteAddViewModel(@org.jetbrains.annotations.NotNull
    com.notes.data.NoteDatabase noteDatabase) {
        super();
    }
    
    public final void addNote(@org.jetbrains.annotations.NotNull
    java.lang.String title, @org.jetbrains.annotations.NotNull
    java.lang.String description) {
    }
}