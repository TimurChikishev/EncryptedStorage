package encrypted.storage.common.ui.di

import encrypted.storage.common.ui.theme.ThemeProvider
import encrypted.storage.common.ui.theme.ThemeProviderImpl
import org.koin.dsl.module

actual val themeModule = module {
    factory<ThemeProvider> {
        ThemeProviderImpl()
    }
}
