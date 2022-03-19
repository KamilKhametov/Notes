package com.notes.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\nJ\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&\u00a8\u0006\u000b"}, d2 = {"Lcom/notes/di/AppComponent;", "", "getNoteDatabase", "Lcom/notes/data/NoteDatabase;", "noteAddComponent", "Lcom/notes/di/components/NoteAddComponent$Builder;", "noteDetailComponent", "Lcom/notes/di/components/NoteDetailComponent$Builder;", "noteListComponent", "Lcom/notes/di/components/NoteListComponent$Builder;", "Builder", "app_debug"})
@dagger.Component(modules = {com.notes.di.AppModule.class, com.notes.di.ViewModelModule.class})
@javax.inject.Singleton
public abstract interface AppComponent {
    
    @org.jetbrains.annotations.NotNull
    public abstract com.notes.data.NoteDatabase getNoteDatabase();
    
    @org.jetbrains.annotations.NotNull
    public abstract com.notes.di.components.NoteListComponent.Builder noteListComponent();
    
    @org.jetbrains.annotations.NotNull
    public abstract com.notes.di.components.NoteAddComponent.Builder noteAddComponent();
    
    @org.jetbrains.annotations.NotNull
    public abstract com.notes.di.components.NoteDetailComponent.Builder noteDetailComponent();
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004H\'J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lcom/notes/di/AppComponent$Builder;", "", "bindsApplication", "context", "Landroid/content/Context;", "build", "Lcom/notes/di/AppComponent;", "app_debug"})
    @dagger.Component.Builder
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull
        public abstract com.notes.di.AppComponent build();
        
        @org.jetbrains.annotations.NotNull
        @dagger.BindsInstance
        public abstract com.notes.di.AppComponent.Builder bindsApplication(@org.jetbrains.annotations.NotNull
        android.content.Context context);
    }
}