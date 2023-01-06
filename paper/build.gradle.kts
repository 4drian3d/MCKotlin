plugins {
    alias(libs.plugins.pluginyml.bukkit)
    alias(libs.plugins.r.paper)
}

dependencies {
    compileOnly(libs.paper)
}

bukkit {
    main = "me.adrianed.mckotlin.paper.PaperPlugin"
    description = project.description as String
    name = "MCKotlin-Paper"
    version = project.version as String

    apiVersion = "1.13"

    author = "4drian3d"
}

tasks.runServer {
    minecraftVersion("1.19.3")
}