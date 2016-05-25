package io.twere.plainpure.ui.modules.shotlist;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import butterknife.ButterKnife;
import io.twere.plainpure.R;
import io.twere.plainpure.base.view.BaseViewModel;
import io.twere.plainpure.data.model.dribbble.Shot;

public class ShotsView extends RelativeLayout implements BaseViewModel<Shot> {

  public ShotsView(Context context) {
    super(context);
    init();
  }

  private void init() {
    View view = inflate(getContext(), R.layout.shot_view, this);
    ButterKnife.bind(view);
  }

  @Override public void setData(Shot data) {

  }
}
