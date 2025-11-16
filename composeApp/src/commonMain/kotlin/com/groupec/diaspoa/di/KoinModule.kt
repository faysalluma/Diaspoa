package com.groupec.sampleapp.di

import com.groupec.sampleapp.data.HomeRepository
import com.groupec.sampleapp.data.HomeRepositoryImpl
import com.groupec.sampleapp.domain.GetDetailUseCase
import com.groupec.sampleapp.domain.GetHomeUseCase
import com.groupec.sampleapp.network.SpaceXApi
import com.groupec.diaspoa.presentation.screens.account.AccountViewModel
import com.groupec.diaspoa.presentation.screens.project.ProjectViewModel
import com.groupec.diaspoa.presentation.screens.shopping.ShoppingViewModel
import com.groupec.sampleapp.ui.home.HomeViewModel
import org.koin.compose.viewmodel.dsl.viewModel
import org.koin.core.KoinApplication
import org.koin.core.context.startKoin
import org.koin.core.module.Module
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

expect val targetModule : Module

val sharedModule = module {

    // ViewModels
    viewModel { HomeViewModel(get()) }
    viewModel { ShoppingViewModel() }
    viewModel { ProjectViewModel() }
    viewModel { AccountViewModel() }

    // Uses cases
    single { GetHomeUseCase(get()) }
    single { GetDetailUseCase() }

    // Repositories
    singleOf(::HomeRepositoryImpl).bind<HomeRepository>()
    single<SpaceXApi> { SpaceXApi() }
}

fun initializeKoin(config: (KoinApplication.() -> Unit) ? = null) {
    startKoin {
        config?.invoke(this)
        modules(targetModule, sharedModule)
    }
}