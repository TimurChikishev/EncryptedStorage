package encrypted.storage.di

import encrypted.storage.core.storage.di.platformStorageModule
import encrypted.storage.core.storage.di.storageModule
import org.koin.core.module.Module

internal val storageModules: Array<Module> = arrayOf(
    platformStorageModule,
    storageModule,
)
