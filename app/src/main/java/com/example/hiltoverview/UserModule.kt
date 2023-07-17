package com.example.hiltoverview

import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent

@InstallIn(FragmentComponent::class)
@Module
abstract class UserModule {

    @Binds
    abstract fun providesUserRepository(sqlRepository: SqlRepository):UserRepository

}