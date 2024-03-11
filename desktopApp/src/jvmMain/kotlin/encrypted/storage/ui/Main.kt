package encrypted.storage.ui

import androidx.compose.ui.Alignment
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowPosition
import androidx.compose.ui.window.WindowState
import androidx.compose.ui.window.application
import com.arkivanov.decompose.DefaultComponentContext
import com.arkivanov.essenty.lifecycle.LifecycleRegistry
import encrypted.storage.di.initKoin
import encrypted.storage.utils.getPreferredWindowSize
import encrypted.storage.utils.runOnUiThread

fun main() = application {
    initKoin()

    val lifecycle = LifecycleRegistry()
    val defaultComponentContext = runOnUiThread {
        DefaultComponentContext(lifecycle = lifecycle)
    }

    Window(
        onCloseRequest = ::exitApplication,
        title = "ESSemple",
        state = WindowState(
            position = WindowPosition.Aligned(Alignment.Center),
            size = getPreferredWindowSize(720, 857)
        ),
    ) {
        MainDesktop(
            defaultComponentContext = defaultComponentContext,
        )
    }
}
