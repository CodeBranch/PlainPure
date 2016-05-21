package io.twere.plainpure.mvp.viewstate;

import com.hannesdorfmann.mosby.mvp.viewstate.ViewState;
import io.twere.plainpure.mvp.view.ShotListView;

public class ShotListViewState implements ViewState<ShotListView> {

  final int STATE_SHOW_LOADING = 0;
  final int STATE_SHOW_ERROR = 1;

  @Override public void apply(ShotListView view, boolean retained) {

  }

  public void setPresentLoading() {

  }
}
