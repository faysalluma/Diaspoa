package com.groupec.sampleapp.di

import com.groupec.sampleapp.data.HomeRepository
import com.groupec.sampleapp.data.HomeRepositoryImpl
import com.groupec.sampleapp.domain.GetDetailUseCase
import com.groupec.sampleapp.domain.GetHomeUseCase
import com.groupec.sampleapp.network.SpaceXApi
import com.groupec.sampleapp.ui.detail.DetailViewModel
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
    single { GetHomeUseCase(get()) }
    single { GetDetailUseCase() }
    single<SpaceXApi> { SpaceXApi() }
    // single { Database(get()) }

    singleOf(::HomeRepositoryImpl).bind<HomeRepository>()
    viewModel { HomeViewModel(get()) }
    viewModel { DetailViewModel(get()) }
}

/*single {
    HttpClient(get()) {
        defaultRequest {
            contentType(ContentType.Application.Json)
        }
    }
}*/

fun initializeKoin(config: (KoinApplication.() -> Unit) ? = null) {
    startKoin {
        config?.invoke(this)
        modules(targetModule, sharedModule)
    }
}