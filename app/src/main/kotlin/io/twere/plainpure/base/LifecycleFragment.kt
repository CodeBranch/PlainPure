package io.twere.plainpure.base

import android.support.v4.app.Fragment
import io.twere.plainpure.rx.RxLifecycle

open class LifecycleFragment() : Fragment(), RxLifecycle.Impl {

  override val lifecycle = RxLifecycle();

  override fun onDestroyView() {
    lifecycle.onDestory();
    super.onDestroyView();
  }
}