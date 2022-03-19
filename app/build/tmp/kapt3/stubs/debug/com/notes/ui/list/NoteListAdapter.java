package com.notes.ui.list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001eBu\u0012K\u0010\u0003\u001aG\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\t\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0004\u0012!\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\f0\u000e\u00a2\u0006\u0002\u0010\u000fJ\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u001c\u0010\u0015\u001a\u00020\f2\n\u0010\u0016\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0014H\u0016J\u001c\u0010\u0018\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0014H\u0016J\u0014\u0010\u001c\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u001dR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R)\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000RS\u0010\u0003\u001aG\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\t\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/notes/ui/list/NoteListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/notes/ui/list/NoteListAdapter$ViewHolder;", "onDetailClick", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "id", "", "title", "description", "", "onDeleteClick", "Lkotlin/Function1;", "(Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;)V", "items", "Ljava/util/ArrayList;", "Lcom/notes/data/model/NoteListItem;", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setItems", "", "ViewHolder", "app_debug"})
public final class NoteListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.notes.ui.list.NoteListAdapter.ViewHolder> {
    private final kotlin.jvm.functions.Function3<java.lang.Long, java.lang.String, java.lang.String, kotlin.Unit> onDetailClick = null;
    private final kotlin.jvm.functions.Function1<java.lang.Long, kotlin.Unit> onDeleteClick = null;
    private final java.util.ArrayList<com.notes.data.model.NoteListItem> items = null;
    
    public NoteListAdapter(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function3<? super java.lang.Long, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> onDetailClick, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.Unit> onDeleteClick) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public com.notes.ui.list.NoteListAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.notes.ui.list.NoteListAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    public final void setItems(@org.jetbrains.annotations.NotNull
    java.util.List<com.notes.data.model.NoteListItem> items) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/notes/ui/list/NoteListAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/notes/databinding/ListItemNoteBinding;", "(Lcom/notes/ui/list/NoteListAdapter;Lcom/notes/databinding/ListItemNoteBinding;)V", "bind", "", "note", "Lcom/notes/data/model/NoteListItem;", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.notes.databinding.ListItemNoteBinding binding = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull
        com.notes.databinding.ListItemNoteBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        com.notes.data.model.NoteListItem note) {
        }
    }
}