# EncryptedStorage

# How to run

If you already runned this sample before, then you need to execute command at least once: /gradlew podInstall

### Run on desktop via Gradle

`./gradlew desktopApp:run`

### Building native desktop distribution

```
./gradlew :desktop:packageDistributionForCurrentOS
# outputs are written to desktop/build/compose/binaries
```

### Run on IOS

- You can launch the iOS app using Xcode

### Run on Android

- You can launch the Android app using IntelliJ IDEA / Android Studio by selecting the androidApp configuration