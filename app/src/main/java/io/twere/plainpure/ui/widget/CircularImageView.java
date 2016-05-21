package io.twere.plainpure.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import io.twere.plainpure.util.ViewUtils;

public class CircularImageView extends ForegroundImageView {

  public CircularImageView(Context context, AttributeSet attrs) {
    super(context, attrs);
    setOutlineProvider(ViewUtils.CIRCULAR_OUTLINE);
    setClipToOutline(true);
  }
}
