// Generated by view binder compiler. Do not edit!
package hackeru.lesson.project.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import hackeru.lesson.project.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class MovieItemBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final ImageView imagePoster;

  @NonNull
  public final TextView textTitle;

  private MovieItemBinding(@NonNull CardView rootView, @NonNull ImageView imagePoster,
      @NonNull TextView textTitle) {
    this.rootView = rootView;
    this.imagePoster = imagePoster;
    this.textTitle = textTitle;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static MovieItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static MovieItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.movie_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static MovieItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.image_poster;
      ImageView imagePoster = ViewBindings.findChildViewById(rootView, id);
      if (imagePoster == null) {
        break missingId;
      }

      id = R.id.text_title;
      TextView textTitle = ViewBindings.findChildViewById(rootView, id);
      if (textTitle == null) {
        break missingId;
      }

      return new MovieItemBinding((CardView) rootView, imagePoster, textTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}