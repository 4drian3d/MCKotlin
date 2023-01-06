import org.spongepowered.gradle.plugin.config.PluginLoaders

plugins {
    alias(libs.plugins.sponge.gradle)
}

repositories {
    maven("https://repo.spongepowered.org/repository/maven-public/")
}

dependencies {
    compileOnly(libs.sponge)
}

sponge {
    apiVersion("8.0.0")
    loader {
        name(PluginLoaders.JAVA_PLAIN)
        version("1.0")
    }

    plugin("mckotlin-sponge") {
        displayName("MCKotlin-Sponge")
        version(project.version as String)
        license("MIT")
        description(project.description as String)
        entrypoint("me.adrianed.mckotlin.sponge.SpongePlugin")
        links {
            homepage("https://github.com/4drian3d/MCKotlin")
            source("https://github.com/4drian3d/MCKotlin")
            issues("https://github.com/4drian3d/MCKotlin/issues")
        }
        contributor("4drian3d") {
            description("Developer")
        }
    }
}