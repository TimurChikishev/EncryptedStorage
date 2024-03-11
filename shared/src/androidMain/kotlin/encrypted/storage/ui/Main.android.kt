package encrypted.storage.ui

import androidx.compose.runtime.Composable
import com.arkivanov.decompose.DefaultComponentContext
import encrypted.storage.common.ui.models.DeviceOrientation
import encrypted.storage.utils.deviceOrientation

@Composable
fun MainAndroid(defaultComponentContext: DefaultComponentContext) {
    MainCommon(
        platformDependencies = object : PlatformDependencies {

            override val componentContext: DefaultComponentContext = defaultComponentContext

            override val orientation: DeviceOrientation = deviceOrientation
        }
    )
}
