package com.murad.daggertutorialapp.di;


import com.murad.daggertutorialapp.BaseActivity;
import com.murad.daggertutorialapp.di.auth.AuthModule;
import com.murad.daggertutorialapp.di.auth.AuthScope;
import com.murad.daggertutorialapp.di.auth.AuthViewModelsModule;
import com.murad.daggertutorialapp.di.main.MainFragmentBuildersModule;
import com.murad.daggertutorialapp.di.main.MainModule;
import com.murad.daggertutorialapp.di.main.MainScope;
import com.murad.daggertutorialapp.di.main.MainViewModelsModule;
import com.murad.daggertutorialapp.ui.auth.AuthActivity;
import com.murad.daggertutorialapp.ui.main.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuilderModule {

    @AuthScope
    @ContributesAndroidInjector(
            modules = {AuthViewModelsModule.class, AuthModule.class}
    )
    abstract AuthActivity contributeAuthActivity();

    @MainScope
    @ContributesAndroidInjector(
            modules = {MainFragmentBuildersModule.class, MainViewModelsModule.class, MainModule.class}
    )
    abstract MainActivity contributeMainActivity();
}
