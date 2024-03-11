package encrypted.storage.core.storage.di

import encrypted.storage.core.storage.utils.DATA_STORE_FILE_NAME
import encrypted.storage.core.storage.utils.createDataStore
import org.koin.android.ext.koin.androidContext
import org.koin.core.module.Module
import org.koin.dsl.module

actual val platformStorageModule: Module = module {
    single {
        createDataStore(
            producePath = { androidContext().filesDir.resolve(DATA_STORE_FILE_NAME).absolutePath }
        )
    }
}
