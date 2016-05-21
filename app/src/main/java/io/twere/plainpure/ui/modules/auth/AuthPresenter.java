package io.twere.plainpure.ui.modules.auth;

import com.hannesdorfmann.mosby.mvp.MvpBasePresenter;
import javax.inject.Inject;

public class AuthPresenter extends MvpBasePresenter<AuthView> {

  @Inject public AuthPresenter() {
  }

  @Override public void attachView(AuthView view) {
    super.attachView(view);
  }

  @Override public void detachView(boolean retainInstance) {
    super.detachView(retainInstance);
  }
}
