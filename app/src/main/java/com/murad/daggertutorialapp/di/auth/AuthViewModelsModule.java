package com.murad.daggertutorialapp.di.auth;

import androidx.lifecycle.ViewModel;

import com.murad.daggertutorialapp.di.ViewModelKey;
import com.murad.daggertutorialapp.ui.auth.AuthViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public abstract class AuthViewModelsModule {

    @Binds
    @IntoMap
    @ViewModelKey(AuthViewModel.class)
    public abstract ViewModel bindAuthViewModel(AuthViewModel viewModel);

}
