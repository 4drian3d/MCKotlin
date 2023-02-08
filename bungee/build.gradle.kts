plugins {
    id("mckotlin.shadow")
    alias(libs.plugins.pluginyml.bungee)
    alias(libs.plugins.r.waterfall)
}

dependencies {
    compileOnly(libs.waterfall)
}

bungee {
    main = "io.github._4drian3d.mckotlin.bungee.BungeePlugin"
    description = project.description as String
    name = "MCKotlin-Bungee"
    version = project.version as String

    author = "4drian3d"
}

tasks.runWaterfall {
    waterfallVersion("1.19")
}

kotlin {
    jvmToolchain {
        languageVersion.set(JavaLanguageVersion.of(8))
    }
}