package io.twere.plainpure.base.viper;

import android.os.Bundle;
import android.support.annotation.StringRes;

public abstract class BaseMainFragment extends BaseFragment implements BaseMainView {
  public abstract String getTitle();

  @Override public void showError(@StringRes int message) {

  }

  @Override public void onActivityCreated(Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
  }

  @Override public void onDestroyView() {
    super.onDestroyView();
    getPresenter().setRouter(null);
  }
}
