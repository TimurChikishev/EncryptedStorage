package encrypted.storage.utils

import android.content.res.Configuration
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalConfiguration
import encrypted.storage.common.ui.models.DeviceOrientation

internal val deviceOrientation: DeviceOrientation
    @Composable get() = when (LocalConfiguration.current.orientation) {
        Configuration.ORIENTATION_LANDSCAPE -> DeviceOrientation.Landscape
        Configuration.ORIENTATION_PORTRAIT -> DeviceOrientation.Portrait
        else -> DeviceOrientation.Undefined
    }
