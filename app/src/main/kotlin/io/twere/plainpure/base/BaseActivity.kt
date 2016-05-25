package io.twere.plainpure.base

import android.os.Handler
import android.support.v7.app.AppCompatActivity
import io.twere.plainpure.rx.RxLifecycle
import java.lang.ref.WeakReference

abstract class BaseActivity : AppCompatActivity(), RxLifecycle.Impl {

  companion object {

    class GlobalHandler : Handler {

      private val mOuter: WeakReference<BaseActivity>

      constructor(activity: BaseActivity) {
        mOuter = WeakReference(activity)
      }

    }

  }

  override final  val lifecycle = RxLifecycle()

/*
  val handler: GlobalHandler by lazy {
    GlobalHandler(this)
  }
*/


}

