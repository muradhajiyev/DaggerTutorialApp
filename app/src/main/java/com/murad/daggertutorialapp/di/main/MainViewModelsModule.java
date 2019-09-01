package com.murad.daggertutorialapp.di.main;

import androidx.lifecycle.ViewModel;

import com.murad.daggertutorialapp.di.ViewModelKey;
import com.murad.daggertutorialapp.ui.main.posts.PostsViewModel;
import com.murad.daggertutorialapp.ui.main.profile.ProfileViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public abstract class MainViewModelsModule {

    @Binds
    @IntoMap
    @ViewModelKey(ProfileViewModel.class)
    public abstract ViewModel bindProfileViewModel(ProfileViewModel profileViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(PostsViewModel.class)
    public abstract ViewModel bindPostsViewModel(PostsViewModel profileViewModel);

}
