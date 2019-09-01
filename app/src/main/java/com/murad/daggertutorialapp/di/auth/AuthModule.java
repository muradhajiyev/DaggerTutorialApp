package com.murad.daggertutorialapp.di.auth;

import com.murad.daggertutorialapp.models.User;
import com.murad.daggertutorialapp.network.auth.AuthApi;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

@Module
public class AuthModule {

    @AuthScope
    @Provides
    static AuthApi provideAuthApi(Retrofit retrofit){
        return retrofit.create(AuthApi.class);
    }

}
