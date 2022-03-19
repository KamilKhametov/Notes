// Generated by view binder compiler. Do not edit!
package com.notes.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.notes.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ListItemNoteBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView contentLabel;

  @NonNull
  public final TextView titleLabel;

  private ListItemNoteBinding(@NonNull LinearLayout rootView, @NonNull TextView contentLabel,
      @NonNull TextView titleLabel) {
    this.rootView = rootView;
    this.contentLabel = contentLabel;
    this.titleLabel = titleLabel;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ListItemNoteBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ListItemNoteBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.list_item_note, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ListItemNoteBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.contentLabel;
      TextView contentLabel = ViewBindings.findChildViewById(rootView, id);
      if (contentLabel == null) {
        break missingId;
      }

      id = R.id.titleLabel;
      TextView titleLabel = ViewBindings.findChildViewById(rootView, id);
      if (titleLabel == null) {
        break missingId;
      }

      return new ListItemNoteBinding((LinearLayout) rootView, contentLabel, titleLabel);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
