package io.twere.plainpure.base.viper;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import butterknife.ButterKnife;

public abstract class BaseFragment extends Fragment {

  @Override public void onActivityCreated(Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    inject();
    //noinspection unchecked
    getPresenter().setView(this);
  }

  @Override public void onStart() {
    super.onStart();
    getPresenter().onStart();
  }

  @Override public void onStop() {
    super.onStop();
    getPresenter().onStop();
  }

  @Override public void onDestroyView() {
    ButterKnife.unbind(this);
    super.onDestroyView();
  }

  protected abstract BasePresenter getPresenter();

  protected abstract void inject();
}
