package encrypted.storage.ui

import androidx.compose.ui.window.ComposeUIViewController
import com.arkivanov.decompose.DefaultComponentContext
import encrypted.storage.common.ui.models.DeviceOrientation
import encrypted.storage.utils.rememberDeviceOrientation
import platform.UIKit.UIViewController

@Suppress("FunctionName", "unused")
fun MainViewController(defaultComponentContext: DefaultComponentContext): UIViewController =
    ComposeUIViewController {

        val orientation = rememberDeviceOrientation()

        MainCommon(
            platformDependencies = object : PlatformDependencies {

                override val componentContext: DefaultComponentContext = defaultComponentContext

                override val orientation: DeviceOrientation = orientation
            }
        )
    }
