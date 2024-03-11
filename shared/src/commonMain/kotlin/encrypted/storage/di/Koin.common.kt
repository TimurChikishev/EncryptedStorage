package encrypted.storage.di

import encrypted.storage.common.ui.di.themeModule
import org.koin.core.context.startKoin
import org.koin.core.module.Module
import org.koin.dsl.KoinAppDeclaration

fun initKoin(appDeclaration: KoinAppDeclaration = {}) {
    startKoin {
        appDeclaration()
        modules(koinPlatformModules())
        modules(
            themeModule,
            *storageModules,
        )
    }
}

expect fun koinPlatformModules(): List<Module>
