package encrypted.storage.ui

import androidx.compose.runtime.Composable
import com.arkivanov.decompose.DefaultComponentContext
import encrypted.storage.common.ui.models.DeviceOrientation

@Composable
fun MainDesktop(defaultComponentContext: DefaultComponentContext) {
    MainCommon(
        platformDependencies = object : PlatformDependencies {

            override val componentContext: DefaultComponentContext = defaultComponentContext

            override val orientation: DeviceOrientation = DeviceOrientation.Portrait
        }
    )
}
