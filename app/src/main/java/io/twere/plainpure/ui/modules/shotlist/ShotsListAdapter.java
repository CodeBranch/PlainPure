package io.twere.plainpure.ui.modules.shotlist;

import android.content.Context;
import android.view.ViewGroup;
import io.twere.plainpure.base.view.BaseAdapter;
import io.twere.plainpure.base.view.BaseRecyclerViewHolder;
import io.twere.plainpure.data.model.dribbble.Shot;
import java.util.List;
import javax.inject.Inject;

public class ShotsListAdapter
    extends BaseAdapter<Shot, ShotsView, BaseRecyclerViewHolder<ShotsView>> {

  private Context mContext;
  private List<Shot> mData;

  @Inject public ShotsListAdapter(Context mContext) {
    this.mContext = mContext;
  }

  @Override
  public BaseRecyclerViewHolder<ShotsView> onCreateViewHolder(ViewGroup parent, int viewType) {
    return new BaseRecyclerViewHolder<>(new ShotsView(mContext));
  }

  @Override public int getItemCount() {
    return super.getItemCount();
  }

  public List<Shot> getmData() {
    return mData;
  }
}
