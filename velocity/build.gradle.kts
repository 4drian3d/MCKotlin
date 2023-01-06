plugins {
    kotlin("jvm")
    kotlin("kapt")
    id("xyz.jpenilla.run-velocity") version "2.0.1"
    //id("net.kyori.blossom") version "1.3.1"
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

/*blossom {
    replaceTokenIn("src/main/kotlin/me/adrianed/mckotlin/velocity/VelocityPlugin.kt")
    replaceToken("{version}", project.version)
}*/
