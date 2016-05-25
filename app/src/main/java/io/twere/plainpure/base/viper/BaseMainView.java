package io.twere.plainpure.base.viper;

import android.support.annotation.StringRes;

public interface BaseMainView {
  void showError(@StringRes int message);

  void showNewMessagesNotification();
}
