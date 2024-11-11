plugins {
    id("mckotlin.shadow")
    alias(libs.plugins.pluginyml.paper)
    alias(libs.plugins.r.paper)
}

dependencies {
    compileOnly(libs.paper)
}

paper {
    main = "io.github._4drian3d.mckotlin.paper.PaperPlugin"
    description = project.description as String
    name = "MCKotlin-Paper"
    version = project.version as String
    load = net.minecrell.pluginyml.bukkit.BukkitPluginDescription.PluginLoadOrder.STARTUP
    apiVersion = "1.20"
    author = "4drian3d"
    foliaSupported = true
}

tasks.runServer {
    minecraftVersion("1.21.3")
}

kotlin {
    jvmToolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}
