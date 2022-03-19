package com.notes.ui._base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B1\u0012*\u0010\u0004\u001a&\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u00000\u0005j\b\u0012\u0004\u0012\u00028\u0000`\t\u00a2\u0006\u0002\u0010\nJ$\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0017J\b\u0010\u001a\u001a\u00020\u001bH\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000b\u001a\u00028\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016\u00a2\u0006\u0002\u0010\u001dJ\b\u0010\u001e\u001a\u00020\u001bH\u0017J\u001a\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0017R\u0016\u0010\u000b\u001a\u0004\u0018\u00018\u00008DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR2\u0010\u0004\u001a&\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u00000\u0005j\b\u0012\u0004\u0012\u00028\u0000`\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R!\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006!"}, d2 = {"Lcom/notes/ui/_base/ViewBindingFragment;", "VB", "Landroidx/viewbinding/ViewBinding;", "Landroidx/fragment/app/Fragment;", "viewBindingCreator", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "", "Lcom/notes/ui/_base/ViewBindingCreator;", "(Lkotlin/jvm/functions/Function3;)V", "viewBinding", "getViewBinding", "()Landroidx/viewbinding/ViewBinding;", "viewBindingStore", "Lcom/notes/ui/_base/ViewBindingStore;", "getViewBindingStore", "()Lcom/notes/ui/_base/ViewBindingStore;", "viewBindingStore$delegate", "Lkotlin/Lazy;", "onCreateView", "Landroid/view/View;", "inflater", "container", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "", "onViewBindingCreated", "(Landroidx/viewbinding/ViewBinding;Landroid/os/Bundle;)V", "onViewBindingDestroyed", "onViewCreated", "view", "app_debug"})
public abstract class ViewBindingFragment<VB extends androidx.viewbinding.ViewBinding> extends androidx.fragment.app.Fragment {
    private final kotlin.jvm.functions.Function3<android.view.LayoutInflater, android.view.ViewGroup, java.lang.Boolean, VB> viewBindingCreator = null;
    private final kotlin.Lazy viewBindingStore$delegate = null;
    
    public ViewBindingFragment(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function3<? super android.view.LayoutInflater, ? super android.view.ViewGroup, ? super java.lang.Boolean, ? extends VB> viewBindingCreator) {
        super();
    }
    
    private final com.notes.ui._base.ViewBindingStore<VB> getViewBindingStore() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    protected final VB getViewBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @androidx.annotation.CallSuper
    @java.lang.Override
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @androidx.annotation.CallSuper
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    public void onViewBindingCreated(@org.jetbrains.annotations.NotNull
    VB viewBinding, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @androidx.annotation.CallSuper
    @java.lang.Override
    public void onDestroyView() {
    }
    
    @androidx.annotation.CallSuper
    public void onViewBindingDestroyed() {
    }
}