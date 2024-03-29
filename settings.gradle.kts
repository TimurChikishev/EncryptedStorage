pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
        google()
    }

    plugins {
        val kotlinVersion = extra["kotlin.version"] as String
        val agpVersion = extra["agp.version"] as String
        val composeVersion = extra["compose.version"] as String

        kotlin("jvm").version(kotlinVersion)
        kotlin("multiplatform").version(kotlinVersion)
        kotlin("plugin.serialization").version(kotlinVersion)
        kotlin("android").version(kotlinVersion)
        id("com.android.base").version(agpVersion)
        id("com.android.application").version(agpVersion)
        id("com.android.library").version(agpVersion)
        id("org.jetbrains.compose").version(composeVersion)
    }
}

rootProject.name = "EncryptedStorage"

include(":androidApp")
include(":desktopApp")

include(":shared")
include(":shared-common-ui")
include(":shared-common-res")
include(":shared-common-graph")
include(":shared-common-utils")
include(":shared-core-domain")
include(":shared-core-storage")
include(":shared-core-navigation")
include(":shared-core-presentation")

include(":shared-feature-splash:ui")