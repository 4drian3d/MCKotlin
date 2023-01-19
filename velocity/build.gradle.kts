plugins {
    id("mckotlin.kapt")
    alias(libs.plugins.r.velocity)
}

dependencies {
    compileOnly(libs.velocity)
    kapt(libs.velocity)
}

tasks{
    runVelocity {
        velocityVersion(libs.versions.velocity.get())
    }
}
