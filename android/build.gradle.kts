plugins {
    id("org.jetbrains.compose")
    id("com.android.application")
    kotlin("android")
}

group "io.github.srjohnathan"
version "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":common"))
    implementation(project(":compose_ui"))
    implementation("androidx.activity:activity-compose:1.5.1")
    implementation(Deps.Koin.core)
    implementation(Deps.Koin.android)
}

android {
    compileSdkVersion(32)
    defaultConfig {
        applicationId = "io.github.srjohnathan.android"
        minSdkVersion(23)
        targetSdkVersion(32)
        versionCode = 1
        versionName = "1.0-SNAPSHOT"
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}