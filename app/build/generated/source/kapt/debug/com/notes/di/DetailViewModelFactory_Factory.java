// Generated by Dagger (https://dagger.dev).
package com.notes.di;

import com.notes.data.NoteDatabase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DetailViewModelFactory_Factory implements Factory<DetailViewModelFactory> {
  private final Provider<NoteDatabase> noteDatabaseProvider;

  public DetailViewModelFactory_Factory(Provider<NoteDatabase> noteDatabaseProvider) {
    this.noteDatabaseProvider = noteDatabaseProvider;
  }

  @Override
  public DetailViewModelFactory get() {
    return newInstance(noteDatabaseProvider.get());
  }

  public static DetailViewModelFactory_Factory create(Provider<NoteDatabase> noteDatabaseProvider) {
    return new DetailViewModelFactory_Factory(noteDatabaseProvider);
  }

  public static DetailViewModelFactory newInstance(NoteDatabase noteDatabase) {
    return new DetailViewModelFactory(noteDatabase);
  }
}
