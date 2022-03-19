package com.notes.data;

import java.lang.System;

@androidx.room.TypeConverters(value = {com.notes.data.LocalDateTimeConverter.class})
@androidx.room.Database(entities = {com.notes.data.NoteDbo.class}, version = 3, exportSchema = false)
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0005"}, d2 = {"Lcom/notes/data/NoteDatabase;", "Landroidx/room/RoomDatabase;", "()V", "noteDao", "Lcom/notes/data/NoteDao;", "app_debug"})
public abstract class NoteDatabase extends androidx.room.RoomDatabase {
    
    public NoteDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract com.notes.data.NoteDao noteDao();
}