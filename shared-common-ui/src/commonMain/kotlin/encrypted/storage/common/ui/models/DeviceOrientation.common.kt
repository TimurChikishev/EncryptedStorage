package encrypted.storage.common.ui.models

sealed interface DeviceOrientation {

    object Portrait : DeviceOrientation

    object Landscape : DeviceOrientation

    object Undefined : DeviceOrientation
}
