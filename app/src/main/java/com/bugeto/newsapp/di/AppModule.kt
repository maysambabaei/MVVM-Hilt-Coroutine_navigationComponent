package com.bugeto.newsapp.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob
import javax.inject.Qualifier
import javax.inject.Singleton

//1
@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    //3
    @ApplicationScope
    @Provides
    @Singleton
    fun provideApplicationScope(): CoroutineScope {
        return CoroutineScope(SupervisorJob())
    }
}

//2
@Retention(AnnotationRetention.RUNTIME)
@Qualifier
annotation class ApplicationScope