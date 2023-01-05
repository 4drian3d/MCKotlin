plugins {
    kotlin("kapt")
}

dependencies {
    shadow(project(":mckotlin-common"))
    compileOnly(libs.velocity)
    kapt(libs.velocity)
}

