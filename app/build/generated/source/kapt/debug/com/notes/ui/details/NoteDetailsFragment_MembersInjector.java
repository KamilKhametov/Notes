// Generated by Dagger (https://dagger.dev).
package com.notes.ui.details;

import androidx.lifecycle.ViewModelProvider;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Named;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NoteDetailsFragment_MembersInjector implements MembersInjector<NoteDetailsFragment> {
  private final Provider<ViewModelProvider.Factory> viewModelFactoryProvider;

  public NoteDetailsFragment_MembersInjector(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    this.viewModelFactoryProvider = viewModelFactoryProvider;
  }

  public static MembersInjector<NoteDetailsFragment> create(
      Provider<ViewModelProvider.Factory> viewModelFactoryProvider) {
    return new NoteDetailsFragment_MembersInjector(viewModelFactoryProvider);
  }

  @Override
  public void injectMembers(NoteDetailsFragment instance) {
    injectViewModelFactory(instance, viewModelFactoryProvider.get());
  }

  @InjectedFieldSignature("com.notes.ui.details.NoteDetailsFragment.viewModelFactory")
  @Named("Detail")
  public static void injectViewModelFactory(NoteDetailsFragment instance,
      ViewModelProvider.Factory viewModelFactory) {
    instance.viewModelFactory = viewModelFactory;
  }
}
