package com.notes.di.components;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/notes/di/components/NoteAddComponent;", "", "inject", "", "fragment", "Lcom/notes/ui/add/NoteAddFragment;", "Builder", "app_debug"})
@dagger.Subcomponent
public abstract interface NoteAddComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull
    com.notes.ui.add.NoteAddFragment fragment);
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lcom/notes/di/components/NoteAddComponent$Builder;", "", "build", "Lcom/notes/di/components/NoteAddComponent;", "app_debug"})
    @dagger.Subcomponent.Builder
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull
        public abstract com.notes.di.components.NoteAddComponent build();
    }
}