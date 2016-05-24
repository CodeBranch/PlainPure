package io.twere.plainpure.ui.modules.profile;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import io.twere.plainpure.R;
import io.twere.plainpure.base.view.BaseFragment;

public class ProfileFragment extends BaseFragment {

  @Override protected int getLayoutRes() {
    return R.layout.profile_fragment;
  }

  public static Fragment newInstance() {
    Bundle args = new Bundle();
    ProfileFragment fragment = new ProfileFragment();
    fragment.setArguments(args);
    return fragment;
  }
}
