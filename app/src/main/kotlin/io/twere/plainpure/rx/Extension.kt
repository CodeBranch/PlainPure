package io.twere.plainpure.rx

import rx.Observable
import rx.Subscriber
import rx.Subscription
import rx.android.schedulers.AndroidSchedulers

fun <T> Observable<T>.onUI(): Observable<T> {
  return observeOn(AndroidSchedulers.mainThread())
}

fun <T> Observable<T>.onUI(onNext: (T) -> Unit): Subscription {
  return observeOn(AndroidSchedulers.mainThread()).subscribe(onNext)
}

fun <T> Observable<T>.onUI(subscriber: Subscriber<T>): Subscription {
  return observeOn(AndroidSchedulers.mainThread()).subscribe(subscriber)
}