plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("android.extensions")
    kotlin("kapt")
}

android {
    compileSdkVersion(AppConfig.compileSdkVersion)
    buildToolsVersion(AppConfig.buildToolsVersion)

    defaultConfig {
        applicationId = AppConfig.applicationId
        minSdkVersion(AppConfig.minSdkVersion)
        targetSdkVersion(AppConfig.targetSdkVersion)
        versionCode = AppConfig.versionCode
        versionName = AppConfig.versionName

        testInstrumentationRunner = AppConfig.testInstrumentationRunner
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                    getDefaultProguardFile("proguard-android-optimize.txt"),
                    "proguard-rules.pro"
            )
        }
    }

    buildFeatures {
        dataBinding = true
        viewBinding = true
    }
}

dependencies {
    implementation(project(mapOf("path" to ":network")))

    implementation(Lib.AndroidX.ConstraintLayout.constraintLayout)
    implementation(Lib.AndroidX.AppCompat.appcompat)
    implementation(Lib.AndroidX.Lifecycle.livedata)
    implementation(Lib.AndroidX.Lifecycle.viewmodel)
    implementation(Lib.AndroidX.Navigation.fragment)
    implementation(Lib.AndroidX.Navigation.ui)

    implementation(Lib.Material.material)

    implementation(Lib.Kotlin.stdlib)

    implementation(Lib.Koin.koinCore)
    implementation(Lib.Koin.koinTest)
    implementation(Lib.Koin.koinAndroid)
}