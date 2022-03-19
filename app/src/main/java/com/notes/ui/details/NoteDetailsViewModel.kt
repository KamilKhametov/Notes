package com.notes.ui.details

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.notes.data.NoteDatabase
import com.notes.data.NoteDbo
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.time.LocalDateTime
import java.time.Month
import java.util.*
import javax.inject.Inject

class NoteDetailsViewModel @Inject constructor(
    private val noteDatabase: NoteDatabase,
) : ViewModel() {

    private val ioDispatcher: CoroutineDispatcher = Dispatchers.IO

    fun updateNote(id: Long, title: String, description: String){

        viewModelScope.launch(ioDispatcher){

            val currentDate = Date()
            val timeFormat = SimpleDateFormat("HH:mm:ss", Locale("ru"))
            val timeText = timeFormat.format(currentDate)

            noteDatabase.noteDao().updateNote(
                NoteDbo(
                    id = id,
                    title = title,
                    content = description,
                    modifiedAt = timeText
                )
            )
        }
    }
}