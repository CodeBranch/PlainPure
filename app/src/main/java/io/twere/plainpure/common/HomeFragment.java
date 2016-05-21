package io.twere.plainpure.common;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import io.twere.plainpure.injection.BindLayout;
import java.lang.annotation.Annotation;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class HomeFragment extends Fragment {

  private static final AtomicInteger lastFragmentId = new AtomicInteger(0);
  private final int fragmentId;

  public HomeFragment() {
    fragmentId = lastFragmentId.incrementAndGet();
  }

  @Nullable @Override public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    Class cls = getClass();
    if (!cls.isAnnotationPresent(BindLayout.class)) return null;
    Annotation annotation = cls.getAnnotation(BindLayout.class);
    BindLayout bindLayout = (BindLayout) annotation;
    View view = inflater.inflate(bindLayout.id(), null);
    ButterKnife.bind(this, view);
    return view;
  }

  @Override public void onActivityCreated(Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    inject();
  }

  @Override public void onDestroyView() {
    super.onDestroyView();
    ButterKnife.unbind(this);
  }

  public String getFragmentName() {
    return Long.toString(fragmentId);
  }

  protected abstract void inject();
}
