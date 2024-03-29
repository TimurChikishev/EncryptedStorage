package encrypted.storage.common.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import encrypted.storage.common.ui.utils.get

@Composable
fun GLBTheme(
    themeProvider: ThemeProvider = get(),
    content: @Composable () -> Unit,
) {
    val currentTheme = themeProvider.getCurrentThemeColors()

    MaterialTheme(
        colorScheme = currentTheme.colorScheme,
        typography = typography,
        content = content,
    )
}
