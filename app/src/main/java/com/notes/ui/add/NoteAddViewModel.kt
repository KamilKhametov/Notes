package com.notes.ui.add

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.notes.data.NoteDatabase
import com.notes.data.NoteDbo
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.text.SimpleDateFormat
import java.util.*
import javax.inject.Inject

class NoteAddViewModel @Inject constructor(
    private val noteDatabase: NoteDatabase
) : ViewModel(){

    private val ioDispatcher: CoroutineDispatcher = Dispatchers.IO

    fun addNote(title: String, description: String){

        viewModelScope.launch(ioDispatcher){

            val currentDate = Date()
            val timeFormat = SimpleDateFormat("HH:mm:ss", Locale("ru"))
            val timeText = timeFormat.format(currentDate)

            noteDatabase.noteDao().addNote(
                NoteDbo(
                    id = UUID.randomUUID().mostSignificantBits,
                    title = title,
                    content = description,
                    modifiedAt = timeText,
                )
            )
        }
    }
}