plugins {
    kotlin("kapt")
    id("xyz.jpenilla.run-velocity") version "2.0.1"
}

dependencies {
    shadow(project(":mckotlin-common"))
    compileOnly(libs.velocity)
    kapt(libs.velocity)
}

tasks{
    runVelocity {
        velocityVersion("3.2.0-SNAPSHOT")
    }
}
