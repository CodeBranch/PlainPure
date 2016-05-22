package io.twere.plainpure.base.view;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

public abstract class BaseRecyclerAdapter<VH extends BaseRecyclerViewHolder, E>
    extends RecyclerView.Adapter<VH> {

  protected final ArrayList<E> mItems;
  protected final LayoutInflater mInflater;

  public BaseRecyclerAdapter(Context context, List<E> items) {
    this.mInflater = LayoutInflater.from(context);
    this.mItems = new ArrayList<>();
    if (null != items && !items.isEmpty()) {
      this.mItems.addAll(items);
    }
  }

  protected View inflateView(ViewGroup parent, int layout) {
    return mInflater.inflate(layout, parent, false);
  }

  @Override public abstract VH onCreateViewHolder(ViewGroup parent, int viewType);

  @Override public abstract void onBindViewHolder(VH holder, int position);

  @Override public int getItemCount() {
    return mItems.size();
  }


  public void clear(List<?> list) {
    int size = list.size();
    list.clear();
    notifyItemRangeRemoved(0, size);
  }

  public void addItem(E e, int index) {
    if (null != e) {
      this.mItems.add(index, e);
      notifyItemInserted(index);
    }
  }

  public int indexOfItem(E e) {
    int index = -1;
    if (null != e) {
      index = this.mItems.indexOf(e);
    }
    return index;
  }

  public void set(int index, E e) {
    if (index < getItemCount()) {
      mItems.set(index, e);
      notifyItemChanged(index);
    }
  }

  public void addItem(E e) {
    if (null != e) {
      this.mItems.add(e);
      int insertPosition = getItemCount() - 1;
      notifyItemInserted(insertPosition);
    }
  }

  public void addItems(List<E> items, int index) {
    if (null != items && !items.isEmpty()) {
      int size = items.size();
      this.mItems.addAll(index, items);
      notifyItemRangeInserted(index, size);
    }
  }

  public void addItems(List<E> items) {
    if (null != items && !items.isEmpty()) {
      int size = items.size();
      int itemCount = getItemCount();
      this.mItems.addAll(items);
      notifyItemRangeInserted(itemCount, size);
    }
  }

  private void remove(int index) {
    mItems.remove(index);
    notifyItemRemoved(index);
  }

  public void remove(E e) {
    if (null != e) {
      remove(mItems.indexOf(e));
    }
  }

  public void updateItem(E e) {
    if (null != e) {
      int index = mItems.indexOf(e);
      if (-1 != index) {
        mItems.set(index, e);
        notifyItemChanged(index);
      }
    }
  }

  public ArrayList<E> getItems() {
    return mItems;
  }

  private E getItem(int position) {
    E e = null;
    if (0 <= position && position < getItemsCount()) {
      e = this.mItems.get(position);
    }
    return e;
  }

  public E getLastItem() {
    return getItem(getItemsCount() - 1);
  }

  public void clear() {
    this.mItems.clear();
    notifyItemRangeRemoved(0, getItemsCount());
  }

  public boolean isEmpty() {
    return 0 == getItemsCount();
  }

  private int getItemsCount() {
    return mItems.size();
  }
}
