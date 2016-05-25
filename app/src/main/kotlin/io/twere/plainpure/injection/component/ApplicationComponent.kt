package io.twere.plainpure.injection.component

import dagger.Component
import io.twere.plainpure.injection.module.ApplicationModule
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(ApplicationModule::class))
interface ApplicationComponent {

}