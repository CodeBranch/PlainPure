package io.twere.plainpure.ui.modules.shotlist;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import io.twere.plainpure.base.view.BaseFragment;

public class ShotListFragment extends BaseFragment {

  @Override protected int getLayoutRes() {
    return 0;
  }

  public static Fragment newInstance() {
    Bundle args = new Bundle();
    ShotListFragment fragment = new ShotListFragment();
    fragment.setArguments(args);
    return fragment;
  }
}
