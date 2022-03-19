package com.notes.di.components

import com.notes.ui.add.NoteAddFragment
import dagger.Subcomponent

@Subcomponent
interface NoteAddComponent {

    fun inject(fragment: NoteAddFragment)

    @Subcomponent.Builder
    interface Builder{

        fun build(): NoteAddComponent
    }
}