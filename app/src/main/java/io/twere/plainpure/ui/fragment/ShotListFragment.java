package io.twere.plainpure.ui.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import io.twere.plainpure.common.view.BaseFragment;

public class ShotListFragment extends BaseFragment {

  public static Fragment newInstance() {
    Bundle args = new Bundle();
    ShotListFragment fragment = new ShotListFragment();
    fragment.setArguments(args);
    return fragment;
  }

  @Override protected int getLayoutRes() {
    return 0;
  }
}
