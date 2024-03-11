plugins {
    id("multiplatform-setup")
}

kotlin {
    sourceSets {
        commonMain {
            apis(
                Deps.Kmm.Storage.datastore,
            )
        }
    }
}

android {
    namespace = "encrypted.storage.core.storage"
}
