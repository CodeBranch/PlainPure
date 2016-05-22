package io.twere.plainpure.ui.modules.shotlist;

import io.twere.plainpure.base.presenter.BaseRxLcePresenter;
import io.twere.plainpure.data.model.dribbble.Shot;
import java.util.List;
import javax.inject.Inject;

public class ShotListPresenter extends BaseRxLcePresenter<ShotListView, List<Shot>> {

  @Inject public ShotListPresenter() {
  }

  @Override public void attachView(ShotListView view) {
    super.attachView(view);
  }

  @Override public void detachView(boolean retainInstance) {
    super.detachView(retainInstance);
  }


}
