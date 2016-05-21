package io.twere.plainpure.mvp.view;

import com.hannesdorfmann.mosby.mvp.MvpView;

public interface ShotListView extends MvpView {
  void presentLoading();
  void presentError();
  void presentList();
}
