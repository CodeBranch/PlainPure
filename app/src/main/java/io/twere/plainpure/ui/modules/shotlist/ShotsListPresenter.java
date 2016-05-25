package io.twere.plainpure.ui.modules.shotlist;

import io.twere.plainpure.base.presenter.BaseRxLcePresenter;
import io.twere.plainpure.data.model.dribbble.Shot;
import java.util.List;
import javax.inject.Inject;

public class ShotsListPresenter extends BaseRxLcePresenter<ShotsListView, List<Shot>> {

  @Inject public ShotsListPresenter() {
  }

  @Override public void attachView(ShotsListView view) {
    super.attachView(view);
  }

  @Override public void detachView(boolean retainInstance) {
    super.detachView(retainInstance);
  }

  @Override protected void onNext(List<Shot> data) {
    super.onNext(data);
  }
}
