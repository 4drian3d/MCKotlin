plugins {
    id("net.minecrell.plugin-yml.bungee") version "0.5.2"
    id("xyz.jpenilla.run-waterfall") version "2.0.1"
}

dependencies {
    compileOnly(libs.waterfall)
}

bungee {
    main = "me.adrianed.mckotlin.bungee.BungeePlugin"
    description = project.description as String
    name = "MCKotlin-Bungee"
    version = project.version as String

    author = "4drian3d"
}

tasks.runWaterfall {
    waterfallVersion("1.19")
}
