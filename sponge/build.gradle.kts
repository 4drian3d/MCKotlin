import org.spongepowered.gradle.plugin.config.PluginLoaders

plugins {
    alias(libs.plugins.sponge.gradle)
    id("mckotlin.shadow")
}

sponge {
    apiVersion("8.1.0")
    loader {
        name(PluginLoaders.JAVA_PLAIN)
        version("1.0")
    }
    plugin("mckotlin-sponge") {
        displayName("MCKotlin-Sponge")
        version(project.version as String)
        license("MIT")
        description(project.description as String)
        entrypoint("io.github._4drian3d.mckotlin.sponge.SpongePlugin")
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


kotlin {
    jvmToolchain {
        languageVersion.set(JavaLanguageVersion.of(8))
    }
}
