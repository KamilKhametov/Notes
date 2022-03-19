package com.notes.ui.list

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.notes.data.NoteDatabase
import com.notes.data.NoteDbo
import com.notes.data.model.NoteListItem
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

class NoteListViewModel @Inject constructor(
    private val noteDatabase: NoteDatabase
) : ViewModel() {

    private val ioDispatcher: CoroutineDispatcher = Dispatchers.IO

    private val _notes = MutableLiveData<List<NoteListItem>?>()
    val notes: LiveData<List<NoteListItem>?> = _notes

    fun getNotes(){
        viewModelScope.launch(ioDispatcher) {
            _notes.postValue(
                noteDatabase.noteDao().getAll().map {
                    NoteListItem(
                        id = it.id,
                        title = it.title.orEmpty(),
                        content = it.content.orEmpty(),
                        createdAt = it.createdAt,
                        modifiedAt = it.modifiedAt
                    )
                }
            )
        }
    }

    fun deleteNote(id: Long){
        viewModelScope.launch(ioDispatcher){
            noteDatabase.noteDao().deleteNote(
                NoteDbo(
                    id = id
                )
            )
        }
    }
}