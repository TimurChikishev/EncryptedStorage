package encrypted.storage.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import com.arkivanov.decompose.DefaultComponentContext
import encrypted.storage.common.ui.models.DeviceOrientation
import encrypted.storage.common.ui.theme.GLBTheme
import encrypted.storage.common.ui.utils.LocalDeviceOrientation
import encrypted.storage.core.navigation.LocalComponentContext

interface PlatformDependencies {

    val componentContext: DefaultComponentContext

    val orientation: DeviceOrientation
}

@Composable
internal fun MainCommon(platformDependencies: PlatformDependencies) {
    CompositionLocalProvider(
        LocalComponentContext provides platformDependencies.componentContext,
        LocalDeviceOrientation provides platformDependencies.orientation,
    ) {
        MainWithProvidedDependencies()
    }
}

@Composable
private fun MainWithProvidedDependencies() {
    GLBTheme {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.background),
        ) {
            NavigationGraph()
        }
    }
}
