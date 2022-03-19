// Generated by Dagger (https://dagger.dev).
package com.notes.ui.list;

import com.notes.data.NoteDatabase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NoteListViewModel_Factory implements Factory<NoteListViewModel> {
  private final Provider<NoteDatabase> noteDatabaseProvider;

  public NoteListViewModel_Factory(Provider<NoteDatabase> noteDatabaseProvider) {
    this.noteDatabaseProvider = noteDatabaseProvider;
  }

  @Override
  public NoteListViewModel get() {
    return newInstance(noteDatabaseProvider.get());
  }

  public static NoteListViewModel_Factory create(Provider<NoteDatabase> noteDatabaseProvider) {
    return new NoteListViewModel_Factory(noteDatabaseProvider);
  }

  public static NoteListViewModel newInstance(NoteDatabase noteDatabase) {
    return new NoteListViewModel(noteDatabase);
  }
}