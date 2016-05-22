package io.twere.plainpure.base.view;

import android.support.v7.widget.RecyclerView;
import android.view.View;

public abstract class BaseRecyclerViewHolder<V extends View> extends RecyclerView.ViewHolder {
  private V itemView;

  public BaseRecyclerViewHolder(V itemView) {
    super(itemView);
    this.itemView = itemView;
  }

  public V getItemView() {
    return itemView;
  }

  public void setItemView(V itemView) {
    this.itemView = itemView;
  }
}
