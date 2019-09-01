package com.murad.daggertutorialapp.di.main;

import com.murad.daggertutorialapp.ui.main.posts.PostsFragment;
import com.murad.daggertutorialapp.ui.main.posts.PostsViewModel;
import com.murad.daggertutorialapp.ui.main.profile.ProfileFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class MainFragmentBuildersModule {

    @ContributesAndroidInjector
    abstract ProfileFragment provideProfileFragment();

    @ContributesAndroidInjector
    abstract PostsFragment providePostsFragment();
}
