package io.twere.plainpure.rx

import rx.Observable
import rx.subjects.BehaviorSubject

class RxLifecycle {
  enum class Event {
    DESTROY
  }

  final val eventBehavior: BehaviorSubject<Event> = BehaviorSubject.create()

  final fun onDestory() {
    eventBehavior.onNext(Event.DESTROY)
  }

  interface Impl {
    val lifecycle: RxLifecycle
  }
}

class CheckLifeCycleTransformer<T>(val eventBehavior: BehaviorSubject<RxLifecycle.Event>) :
    Observable.Transformer<T, T> {
  override fun call(observable: Observable<T>): Observable<T> {
    return observable.takeUntil(
        eventBehavior.skipWhile {
          it != RxLifecycle.Event.DESTROY
        }
    )
  }
}

fun <T> Observable<T>.bindLifecycle(impl: RxLifecycle.Impl):
    Observable<T> {
  return compose(CheckLifeCycleTransformer<T>(impl.lifecycle.eventBehavior))
}