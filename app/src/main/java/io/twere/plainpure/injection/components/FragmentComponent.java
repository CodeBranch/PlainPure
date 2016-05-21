package io.twere.plainpure.injection.components;

import dagger.Component;
import io.twere.plainpure.injection.modules.FragmentModule;
import io.twere.plainpure.injection.scopes.PerFragment;

@PerFragment @Component(dependencies = ApplicationComponent.class, modules = FragmentModule.class)
public interface FragmentComponent {

}
