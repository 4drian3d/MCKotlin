plugins {
    `kotlin-dsl`
}

dependencies {
    implementation(libs.plugin.shadow)
    implementation(libs.plugin.kotlin)
}

repositories {
    gradlePluginPortal()
}

kotlin {
    jvmToolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}