package io.twere.plainpure.common.view;

import android.os.Bundle;
import android.view.View;
import butterknife.ButterKnife;
import com.hannesdorfmann.mosby.mvp.MvpPresenter;
import com.hannesdorfmann.mosby.mvp.lce.MvpLceView;
import com.hannesdorfmann.mosby.mvp.viewstate.lce.MvpLceViewStateActivity;
import icepick.Icepick;

public abstract class BaseLceActivity<CV extends View, M, V extends MvpLceView<M>, P extends MvpPresenter<V>>
    extends MvpLceViewStateActivity<CV, M, V, P> {

  @Override protected void onCreate(Bundle savedInstanceState) {
    injectDependencies();
    super.onCreate(savedInstanceState);
    Icepick.restoreInstanceState(this, savedInstanceState);
  }

  @Override public void onContentChanged() {
    super.onContentChanged();
    ButterKnife.bind(this);
  }

  @Override public void onSaveInstanceState(Bundle outState) {
    super.onSaveInstanceState(outState);
    Icepick.saveInstanceState(this, outState);
  }

  protected void injectDependencies() {

  }
}
