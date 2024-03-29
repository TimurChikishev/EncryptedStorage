package encrypted.storage.common.ui.utils

import androidx.compose.runtime.Composable
import dev.icerock.moko.resources.StringResource
import dev.icerock.moko.resources.compose.stringResource as mokoStringResource

@Composable
actual fun stringResource(resource: StringResource): String = mokoStringResource(resource)

@Composable
actual fun stringResource(resource: StringResource, vararg args: Any): String = mokoStringResource(resource, args)
