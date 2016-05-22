package io.twere.plainpure;

import android.content.Context;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton public class Navigator {
  @Inject public Navigator() {
  }

  private boolean isTablet(Context context) {
    return context.getResources().getBoolean(R.bool.tablet);
  }
}
