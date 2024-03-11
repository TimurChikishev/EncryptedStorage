package encrypted.storage.core.storage.preference.settings

interface SettingsStorage {

    suspend fun isFirstLaunch(): Boolean

    suspend fun setFirstLaunch()
}
