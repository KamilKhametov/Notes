package com.notes.data;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class NoteDao_Impl implements NoteDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<NoteDbo> __insertionAdapterOfNoteDbo;

  private final EntityInsertionAdapter<NoteDbo> __insertionAdapterOfNoteDbo_1;

  private final EntityDeletionOrUpdateAdapter<NoteDbo> __deletionAdapterOfNoteDbo;

  private final EntityDeletionOrUpdateAdapter<NoteDbo> __updateAdapterOfNoteDbo;

  public NoteDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfNoteDbo = new EntityInsertionAdapter<NoteDbo>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `notes` (`id`,`title`,`content`,`createdAt`,`modifiedAt`) VALUES (nullif(?, 0),?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, NoteDbo value) {
        stmt.bindLong(1, value.getId());
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        if (value.getContent() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getContent());
        }
        if (value.getCreatedAt() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getCreatedAt());
        }
        if (value.getModifiedAt() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getModifiedAt());
        }
      }
    };
    this.__insertionAdapterOfNoteDbo_1 = new EntityInsertionAdapter<NoteDbo>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `notes` (`id`,`title`,`content`,`createdAt`,`modifiedAt`) VALUES (nullif(?, 0),?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, NoteDbo value) {
        stmt.bindLong(1, value.getId());
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        if (value.getContent() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getContent());
        }
        if (value.getCreatedAt() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getCreatedAt());
        }
        if (value.getModifiedAt() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getModifiedAt());
        }
      }
    };
    this.__deletionAdapterOfNoteDbo = new EntityDeletionOrUpdateAdapter<NoteDbo>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `notes` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, NoteDbo value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfNoteDbo = new EntityDeletionOrUpdateAdapter<NoteDbo>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `notes` SET `id` = ?,`title` = ?,`content` = ?,`createdAt` = ?,`modifiedAt` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, NoteDbo value) {
        stmt.bindLong(1, value.getId());
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        if (value.getContent() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getContent());
        }
        if (value.getCreatedAt() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getCreatedAt());
        }
        if (value.getModifiedAt() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getModifiedAt());
        }
        stmt.bindLong(6, value.getId());
      }
    };
  }

  @Override
  public void insertAll(final NoteDbo... notes) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfNoteDbo.insert(notes);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void addNote(final NoteDbo note) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfNoteDbo_1.insert(note);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteNote(final NoteDbo note) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfNoteDbo.handle(note);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateNote(final NoteDbo note) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfNoteDbo.handle(note);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<NoteDbo> getAll() {
    final String _sql = "SELECT * FROM notes";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfContent = CursorUtil.getColumnIndexOrThrow(_cursor, "content");
      final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "createdAt");
      final int _cursorIndexOfModifiedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "modifiedAt");
      final List<NoteDbo> _result = new ArrayList<NoteDbo>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final NoteDbo _item;
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final String _tmpTitle;
        if (_cursor.isNull(_cursorIndexOfTitle)) {
          _tmpTitle = null;
        } else {
          _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        }
        final String _tmpContent;
        if (_cursor.isNull(_cursorIndexOfContent)) {
          _tmpContent = null;
        } else {
          _tmpContent = _cursor.getString(_cursorIndexOfContent);
        }
        final String _tmpCreatedAt;
        if (_cursor.isNull(_cursorIndexOfCreatedAt)) {
          _tmpCreatedAt = null;
        } else {
          _tmpCreatedAt = _cursor.getString(_cursorIndexOfCreatedAt);
        }
        final String _tmpModifiedAt;
        if (_cursor.isNull(_cursorIndexOfModifiedAt)) {
          _tmpModifiedAt = null;
        } else {
          _tmpModifiedAt = _cursor.getString(_cursorIndexOfModifiedAt);
        }
        _item = new NoteDbo(_tmpId,_tmpTitle,_tmpContent,_tmpCreatedAt,_tmpModifiedAt);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
