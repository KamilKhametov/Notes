package com.notes.ui.list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\r\u001a\u00020\u0010R\u001c\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0013"}, d2 = {"Lcom/notes/ui/list/NoteListViewModel;", "Landroidx/lifecycle/ViewModel;", "noteDatabase", "Lcom/notes/data/NoteDatabase;", "(Lcom/notes/data/NoteDatabase;)V", "_notes", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/notes/data/model/NoteListItem;", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "notes", "Landroidx/lifecycle/LiveData;", "getNotes", "()Landroidx/lifecycle/LiveData;", "deleteNote", "", "id", "", "app_debug"})
public final class NoteListViewModel extends androidx.lifecycle.ViewModel {
    private final com.notes.data.NoteDatabase noteDatabase = null;
    private final kotlinx.coroutines.CoroutineDispatcher ioDispatcher = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.notes.data.model.NoteListItem>> _notes = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.util.List<com.notes.data.model.NoteListItem>> notes = null;
    
    @javax.inject.Inject
    public NoteListViewModel(@org.jetbrains.annotations.NotNull
    com.notes.data.NoteDatabase noteDatabase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.notes.data.model.NoteListItem>> getNotes() {
        return null;
    }
    
    public final void getNotes() {
    }
    
    public final void deleteNote(long id) {
    }
}