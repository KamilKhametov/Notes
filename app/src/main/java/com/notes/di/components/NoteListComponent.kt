package com.notes.di.components

import com.notes.ui.list.NoteListFragment
import dagger.Subcomponent

@Subcomponent
interface NoteListComponent {

    fun inject(fragment: NoteListFragment)

    @Subcomponent.Builder
    interface Builder{

        fun build(): NoteListComponent
    }
}