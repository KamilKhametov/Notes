package com.notes.ui.list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J \u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002J\u0012\u0010\u001e\u001a\u00020\u00172\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010!\u001a\u00020\u0017H\u0016J\u001a\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR$\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0011\u0010\u0003\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006$"}, d2 = {"Lcom/notes/ui/list/NoteListFragment;", "Lcom/notes/ui/_base/ViewBindingFragment;", "Lcom/notes/databinding/FragmentNoteListBinding;", "()V", "noteListAdapter", "Lcom/notes/ui/list/NoteListAdapter;", "getNoteListAdapter", "()Lcom/notes/ui/list/NoteListAdapter;", "noteListAdapter$delegate", "Lkotlin/Lazy;", "viewModel", "Lcom/notes/ui/list/NoteListViewModel;", "getViewModel", "()Lcom/notes/ui/list/NoteListViewModel;", "viewModel$delegate", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getViewModelFactory$annotations", "getViewModelFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "setViewModelFactory", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "deleteNote", "", "id", "", "navigateDetailNote", "title", "", "description", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onViewBindingCreated", "viewBinding", "app_debug"})
public final class NoteListFragment extends com.notes.ui._base.ViewBindingFragment<com.notes.databinding.FragmentNoteListBinding> {
    @javax.inject.Inject
    public androidx.lifecycle.ViewModelProvider.Factory viewModelFactory;
    private final kotlin.Lazy viewModel$delegate = null;
    private final kotlin.Lazy noteListAdapter$delegate = null;
    
    public NoteListFragment() {
        super(null);
    }
    
    @java.lang.Override
    public void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.ViewModelProvider.Factory getViewModelFactory() {
        return null;
    }
    
    @javax.inject.Named(value = "List")
    @java.lang.Deprecated
    public static void getViewModelFactory$annotations() {
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.ViewModelProvider.Factory p0) {
    }
    
    private final com.notes.ui.list.NoteListViewModel getViewModel() {
        return null;
    }
    
    private final com.notes.ui.list.NoteListAdapter getNoteListAdapter() {
        return null;
    }
    
    @java.lang.Override
    public void onResume() {
    }
    
    @java.lang.Override
    public void onViewBindingCreated(@org.jetbrains.annotations.NotNull
    com.notes.databinding.FragmentNoteListBinding viewBinding, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void navigateDetailNote(long id, java.lang.String title, java.lang.String description) {
    }
    
    private final void deleteNote(long id) {
    }
}