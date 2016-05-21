package io.twere.plainpure.ui.modules.auth;

import com.hannesdorfmann.mosby.mvp.viewstate.ViewState;
import io.twere.plainpure.common.view.viewstate.BaseViewStateFragment;

public class AuthFragment extends BaseViewStateFragment<AuthView, AuthPresenter>
    implements AuthView {

  @Override public void showLoginForm() {

  }

  @Override public void showError() {

  }

  @Override public void showLoading() {

  }

  @Override public void loginSuccessful() {

  }

  @Override protected int getLayoutRes() {
    return 0;
  }

  @Override public ViewState createViewState() {
    return null;
  }

  @Override public void onNewViewStateInstance() {

  }

  @Override public AuthPresenter createPresenter() {
    return null;
  }
}
