package com.notes.di

import android.content.Context
import com.notes.data.NoteDatabase
import com.notes.di.components.NoteAddComponent
import com.notes.di.components.NoteDetailComponent
import com.notes.di.components.NoteListComponent
import dagger.Component
import dagger.BindsInstance
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AppModule::class,
        ViewModelModule::class
    ]
)
interface AppComponent {

    @Component.Builder
    interface Builder {
        fun build(): AppComponent

        @BindsInstance
        fun bindsApplication(context: Context): Builder
    }

    fun getNoteDatabase(): NoteDatabase

    fun noteListComponent(): NoteListComponent.Builder

    fun noteAddComponent(): NoteAddComponent.Builder

    fun noteDetailComponent(): NoteDetailComponent.Builder
}