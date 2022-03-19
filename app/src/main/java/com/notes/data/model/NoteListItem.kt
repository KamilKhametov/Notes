package com.notes.data.model

data class NoteListItem(
    val id: Long,
    val title: String,
    val content: String,
    val createdAt: String?= "",
    val modifiedAt: String ?= ""
)