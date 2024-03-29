package encrypted.storage.app

import android.app.Application
import io.github.aakira.napier.DebugAntilog
import io.github.aakira.napier.Napier
import encrypted.storage.BuildConfig
import encrypted.storage.di.initKoin
import org.koin.android.ext.koin.androidContext

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        setupKoin()
        setupNapier()
    }

    private fun setupKoin() {
        initKoin {
            androidContext(this@App)
            modules()
        }
    }

    private fun setupNapier() {
        if (BuildConfig.DEBUG) {
            Napier.base(DebugAntilog(defaultTag = "LearnGit"))
        }
    }
}
