import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.8.0" apply false
    id("com.github.johnrengelman.shadow") version "7.1.2" apply false
}

fun String.firstUppercase(): String {
    val st = this.substring(9)
    val char = st[0]
    return char.toUpperCase() + st.substring(1)
}

subprojects {
    val projectName = name
    repositories.mavenCentral()
    plugins.apply("org.jetbrains.kotlin.jvm")
    if (projectName != "mckotlin-common") {
        plugins.apply("com.github.johnrengelman.shadow")
        tasks {
            withType<ShadowJar> {
                archiveFileName.set("MCKotlin${projectName.firstUppercase()}-${project.version}.jar")
                duplicatesStrategy = DuplicatesStrategy.EXCLUDE

                exclude("org/**")
            }
            named<DefaultTask>("build") {
                dependsOn("shadowJar")
            }
            withType<KotlinCompile> {
                compilerOptions {
                    jvmTarget.set(org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_17)
                }
            }
        }

        dependencies {
            add("shadow", project(":mckotlin-common"))
        }
    }
    if (projectName != "mckotlin-sponge") {
        repositories.maven("https://repo.papermc.io/repository/maven-public/")
    }
}
