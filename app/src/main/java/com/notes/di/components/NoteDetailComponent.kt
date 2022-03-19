package com.notes.di.components

import com.notes.ui.details.NoteDetailsFragment
import dagger.Subcomponent

@Subcomponent
interface NoteDetailComponent {

    fun inject(fragment: NoteDetailsFragment)

    @Subcomponent.Builder
    interface Builder{

        fun build(): NoteDetailComponent
    }
}