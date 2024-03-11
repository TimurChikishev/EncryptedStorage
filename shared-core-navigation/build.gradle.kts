plugins {
    id("multiplatform-common-setup")
    kotlin("plugin.serialization")
    id("kotlin-parcelize")
}

android {
    namespace = "encrypted.storage.core.navigation"
}
