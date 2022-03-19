package com.notes.di

import android.content.Context
import androidx.room.Room
import com.notes.data.NoteDatabase
import dagger.Module
import dagger.Provides

@Module
class AppModule {

    @Provides
    fun provideNoteDatabase(
        context: Context
    ) = Room.databaseBuilder(
        context,
        NoteDatabase::class.java, "database-note.db"
    ).createFromAsset("database-note.db")
        .fallbackToDestructiveMigration()
        .build()
}