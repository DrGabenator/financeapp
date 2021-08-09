plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("android.extensions")
    id("kotlin-android")
    id("kotlin-kapt")
}

android {
    compileSdkVersion(AppConfig.compileSdkVersion)
    buildToolsVersion(AppConfig.buildToolsVersion)
}

buildFeatures {
    dataBinding = true
    viewBinding = true
}

defaultConfig {
    applicationId = AppConfig.applicationId
    minSdkVersion(AppConfig.minSdkVersion)
    targetSdkVersion(AppConfig.targetSdkVersion)
    versionCode = AppConfig.versionCode
    versionName = AppConfig.versionName

    testInstrumentationRunner = AppConfig.testInstrumentationRunner
}