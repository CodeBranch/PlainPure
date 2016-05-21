package io.twere.plainpure.util;

import android.util.Log;
import java.util.Arrays;

public class Ours {

  private static final String TAG = "PlainPure";

  public static void v(Object... value) {
    Log.v(TAG, Arrays.toString(value));
  }


}
