package io.twere.plainpure.ui.modules.auth;

import com.hannesdorfmann.mosby.mvp.MvpView;

public interface AuthView extends MvpView {
  void showLoginForm();

  void showError();

  void showLoading();

  void loginSuccessful();
}
