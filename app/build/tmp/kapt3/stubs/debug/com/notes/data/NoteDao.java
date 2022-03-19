package com.notes.data;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\'J!\u0010\t\u001a\u00020\u00032\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u000b\"\u00020\u0005H\'\u00a2\u0006\u0002\u0010\fJ\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u000e"}, d2 = {"Lcom/notes/data/NoteDao;", "", "addNote", "", "note", "Lcom/notes/data/NoteDbo;", "deleteNote", "getAll", "", "insertAll", "notes", "", "([Lcom/notes/data/NoteDbo;)V", "updateNote", "app_debug"})
public abstract interface NoteDao {
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM notes")
    public abstract java.util.List<com.notes.data.NoteDbo> getAll();
    
    @androidx.room.Insert
    public abstract void insertAll(@org.jetbrains.annotations.NotNull
    com.notes.data.NoteDbo... notes);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.IGNORE)
    public abstract void addNote(@org.jetbrains.annotations.NotNull
    com.notes.data.NoteDbo note);
    
    @androidx.room.Update
    public abstract void updateNote(@org.jetbrains.annotations.NotNull
    com.notes.data.NoteDbo note);
    
    @androidx.room.Delete
    public abstract void deleteNote(@org.jetbrains.annotations.NotNull
    com.notes.data.NoteDbo note);
}