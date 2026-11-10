plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.raghvendra.sweetbirthday"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.raghvendra.sweetbirthday"
        minSdk = 21
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }

    signingConfigs {
        create("release") {
            storeFile = file("release.keystore")
            storePassword = "SweetBirthday2026"
            keyAlias = "sweetbirthday"
            keyPassword = "SweetBirthday2026"
        }
    }

    buildTypes {
        debug {
            applicationIdSuffix = ""
            isDebuggable = true
            signingConfig = signingConfigs.getByName("release")
        }
        release {
            isMinifyEnabled = false
            signingConfig = signingConfigs.getByName("release")
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    androidResources {
        noCompress += listOf("mp3", "gif", "woff2", "jpg", "png")
    }

    lint {
        checkReleaseBuilds = false
        abortOnError = false
    }
}

dependencies {
    implementation("androidx.core:core:1.15.0")
    implementation("androidx.activity:activity:1.10.1")
}

