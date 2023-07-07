plugins {
    alias(libs.plugins.pluginyml.bukkit)
    alias(libs.plugins.r.paper)
    id("mckotlin.shadow")
}

dependencies {
    compileOnly(libs.paper)
}

bukkit {
    main = "io.github._4drian3d.mckotlin.paper.PaperPlugin"
    description = project.description as String
    name = "MCKotlin-Paper"
    version = project.version as String
    load = net.minecrell.pluginyml.bukkit.BukkitPluginDescription.PluginLoadOrder.STARTUP
    apiVersion = "1.13"
    author = "4drian3d"
    foliaSupported = true
}

tasks.runServer {
    // I wanted to use 1.19.3, but... jvmToolChain 8
    minecraftVersion("1.16.5")
}

kotlin {
    jvmToolchain {
        languageVersion.set(JavaLanguageVersion.of(8))
    }
}
