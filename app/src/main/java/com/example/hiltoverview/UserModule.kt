package com.example.hiltoverview

import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent
import javax.inject.Named

@InstallIn(FragmentComponent::class)
@Module
class UserModule {

    @Provides
    @Named("sql")
     fun providesSqlRepository(sqlRepository: SqlRepository):UserRepository{
         return sqlRepository
     }

    @Provides
    @FireBaseQualifier
    fun providesFireBaseRepository( ):UserRepository{
        return FireBaseRepository()
    }

}