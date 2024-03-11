package encrypted.storage.ui

import androidx.compose.runtime.Composable
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.fade
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.plus
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.scale
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.stackAnimation
import kotlinx.collections.immutable.persistentListOf
import encrypted.storage.core.navigation.NavGraph
import encrypted.storage.core.navigation.NavigationContent
import encrypted.storage.core.navigation.rememberRouter
import encrypted.storage.feature.splash.ui.SplashScreen

@Composable
internal fun NavigationGraph() {
    val router = rememberRouter(
        stack = persistentListOf(NavGraph.Splash),
        clazz = NavGraph::class,
    )

    NavigationContent(
        router = router,
        animation = stackAnimation(fade().plus(scale()))
    ) { screen ->
        when (screen) {
            is NavGraph.Splash -> SplashScreen(router = router)
            is NavGraph.Main -> Unit
        }
    }
}
