package encrypted.storage.feature.splash.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.arkivanov.decompose.router.stack.replaceCurrent
import encrypted.storage.core.navigation.NavGraph
import encrypted.storage.core.navigation.Router
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(
    router: Router<NavGraph>,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Icon(
            modifier = Modifier.size(200.dp),
            imageVector = Icons.Outlined.Lock,
            tint = MaterialTheme.colorScheme.onBackground,
            contentDescription = null,
        )
    }
    LaunchedEffect(true) {
        delay(1000)
        router.replaceCurrent(NavGraph.Main)
    }
}
