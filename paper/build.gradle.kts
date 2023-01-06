plugins {
    id("net.minecrell.plugin-yml.bukkit") version "0.5.2"
    id("xyz.jpenilla.run-paper") version "2.0.1"
}

dependencies {
    compileOnly("io.papermc.paper:paper-api:1.19.3-R0.1-SNAPSHOT")
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