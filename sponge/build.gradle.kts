plugins {
    id("mckotlin.shadow")
}

dependencies {
    compileOnly(libs.sponge)
}

tasks {
    processResources {
        filesMatching("META-INF/sponge_plugins.json") {
            expand("version" to project.version)
        }
    }
}

kotlin {
    jvmToolchain {
        languageVersion.set(JavaLanguageVersion.of(8))
    }
}
