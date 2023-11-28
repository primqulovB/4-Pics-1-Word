package uz.gita.a4pics1word.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import uz.gita.a4pics1word.domain.repository.AppRepository
import uz.gita.a4pics1word.domain.repository.impl.AppRepositoryImpl
import javax.inject.Singleton

@[Module InstallIn(SingletonComponent::class)]
interface RepositoryModule {

    @[Binds Singleton]
    fun repositoryBinds(impl: AppRepositoryImpl): AppRepository
}