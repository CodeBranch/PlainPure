package io.twere.plainpure.ui.modules.shotlist;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import io.twere.plainpure.R;
import io.twere.plainpure.base.view.BaseFragment;
import io.twere.plainpure.data.model.dribbble.Shot;
import java.util.List;

public class ShotsListFragment extends BaseFragment implements ShotsListView {

  @Override protected int getLayoutRes() {
    return R.layout.shot_list_fragment;
  }

  public static Fragment newInstance() {
    Bundle args = new Bundle();
    ShotsListFragment fragment = new ShotsListFragment();
    fragment.setArguments(args);
    return fragment;
  }

  @Override public void showShotListForm() {

  }

  @Override public void showError() {

  }

  @Override public void showLoading() {

  }

  @Override public void setShot(Shot shot) {

  }

  @Override public void showLoading(boolean pullToRefresh) {

  }

  @Override public void showContent() {

  }

  @Override public void showError(Throwable e, boolean pullToRefresh) {

  }

  @Override public void setData(List<Shot> data) {

  }

  @Override public void loadData(boolean pullToRefresh) {

  }
}
