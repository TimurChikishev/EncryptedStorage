package encrypted.storage.core.utils.common

fun <T> T?.requiredNotNull(message: String? = null) = this ?: message?.let { error(it) } ?: this!!
