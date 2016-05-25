package io.twere.plainpure.base.view;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

public abstract class BaseAdapter<V, T extends View & BaseViewModel, VH extends BaseRecyclerViewHolder<T>>
    extends RecyclerView.Adapter<VH> {

  protected List<V> mList = new ArrayList<>();

  @Override public abstract VH onCreateViewHolder(ViewGroup parent, int viewType);

  @Override public void onBindViewHolder(VH holder, int position) {
    T view = holder.getItemView();
    view.setData(mList.get(position));
  }

  @Override public int getItemCount() {
    if (mList.isEmpty()) {
      return 0;
    }
    return mList.size();
  }
}
