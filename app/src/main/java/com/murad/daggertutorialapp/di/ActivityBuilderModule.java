package com.murad.daggertutorialapp.di;


import com.murad.daggertutorialapp.di.auth.AuthModule;
import com.murad.daggertutorialapp.di.auth.AuthViewModelsModule;
import com.murad.daggertutorialapp.ui.auth.AuthActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuilderModule {

    @ContributesAndroidInjector(
            modules = {AuthViewModelsModule.class, AuthModule.class}
    )
    abstract AuthActivity contributeAuthActivity();

}
