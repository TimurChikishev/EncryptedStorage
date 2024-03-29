package encrypted.storage.core.storage.utils

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.PreferenceDataStoreFactory
import androidx.datastore.preferences.core.Preferences
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import encrypted.storage.core.utils.coroutines.ioDispatcher
import okio.Path.Companion.toPath

internal fun createDataStore(
    producePath: () -> String,
    coroutineScope: CoroutineScope = CoroutineScope(ioDispatcher + Job()),
): DataStore<Preferences> = PreferenceDataStoreFactory.createWithPath(
    corruptionHandler = null,
    migrations = emptyList(),
    scope = coroutineScope,
    produceFile = { producePath().toPath() },
)

internal const val DATA_STORE_FILE_NAME = "learngit.preferences_pb"
