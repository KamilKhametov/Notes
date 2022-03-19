// Generated by view binder compiler. Do not edit!
package com.notes.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.notes.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentNoteDetailsBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppCompatButton btnUpdateData;

  @NonNull
  public final AppCompatEditText changeDescription;

  @NonNull
  public final AppCompatEditText changeTitle;

  @NonNull
  public final Toolbar toolbar;

  private FragmentNoteDetailsBinding(@NonNull ConstraintLayout rootView,
      @NonNull AppCompatButton btnUpdateData, @NonNull AppCompatEditText changeDescription,
      @NonNull AppCompatEditText changeTitle, @NonNull Toolbar toolbar) {
    this.rootView = rootView;
    this.btnUpdateData = btnUpdateData;
    this.changeDescription = changeDescription;
    this.changeTitle = changeTitle;
    this.toolbar = toolbar;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentNoteDetailsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentNoteDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_note_details, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentNoteDetailsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnUpdateData;
      AppCompatButton btnUpdateData = ViewBindings.findChildViewById(rootView, id);
      if (btnUpdateData == null) {
        break missingId;
      }

      id = R.id.changeDescription;
      AppCompatEditText changeDescription = ViewBindings.findChildViewById(rootView, id);
      if (changeDescription == null) {
        break missingId;
      }

      id = R.id.changeTitle;
      AppCompatEditText changeTitle = ViewBindings.findChildViewById(rootView, id);
      if (changeTitle == null) {
        break missingId;
      }

      id = R.id.toolbar;
      Toolbar toolbar = ViewBindings.findChildViewById(rootView, id);
      if (toolbar == null) {
        break missingId;
      }

      return new FragmentNoteDetailsBinding((ConstraintLayout) rootView, btnUpdateData,
          changeDescription, changeTitle, toolbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}