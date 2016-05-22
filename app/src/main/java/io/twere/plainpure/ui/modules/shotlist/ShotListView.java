package io.twere.plainpure.ui.modules.shotlist;

import com.hannesdorfmann.mosby.mvp.lce.MvpLceView;
import io.twere.plainpure.data.model.dribbble.Shot;
import java.util.List;

public interface ShotListView extends MvpLceView<List<Shot>> {
  void showShotListForm();

  void showError();

  void showLoading();

  void setShot(Shot shot);
}
