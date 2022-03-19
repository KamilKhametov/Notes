package com.notes.data

import androidx.room.*

@Dao
interface NoteDao {

    @Query("SELECT * FROM notes")
    fun getAll(): List<NoteDbo>

    @Insert
    fun insertAll(vararg notes: NoteDbo)

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun addNote(note: NoteDbo)

    @Update
    fun updateNote(note: NoteDbo)

    @Delete
    fun deleteNote(note: NoteDbo)
}