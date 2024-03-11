plugins {
    kotlin("multiplatform")
    id("com.android.application")
    id("org.jetbrains.compose")
}

kotlin {
    android()
    sourceSets {
        androidMain {
            dependencies {
                implementation(project(":shared"))
                implementation(Deps.Kmm.Logging.napier)
            }
        }
    }
}

android {
    namespace = "encrypted.storage"

    compileSdk = Versions.Android.compileSdk
    defaultConfig {
        applicationId = "com.devchik.encrypted.storage"
        minSdk = Versions.Android.minSdk
        targetSdk = Versions.Android.targetSdk
        versionCode = Build.getVersionCode(project)
        versionName = Build.getVersionName(project)
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}
