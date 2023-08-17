rootProject.name = "mckotlin-parent"

arrayOf("common", "paper", "velocity", "sponge", "bungee").forEach {
    include("mckotlin-$it")
    project(":mckotlin-$it").projectDir = file(it)
}

pluginManagement {
    includeBuild("build-logic")
    repositories {
        gradlePluginPortal()
        mavenCentral()
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.7.0"
}
