plugins {
    id("com.gradleup.shadow")
    id("mckotlin.base")
}

val libs = extensions.getByType(org.gradle.accessors.dm.LibrariesForLibs::class)

fun String.firstUppercase(): String {
    val st = this.substring(9)
    val char = st[0]
    return char.uppercase() + st.substring(1)
}

val actualPluginVersion = project.version.toString().substringBefore('-')

tasks {
    shadowJar {
        archiveFileName.set("MCKotlin${project.name.firstUppercase()}-${actualPluginVersion}-k${libs.versions.kotlin.get()}.jar")
        archiveClassifier.set("")
        duplicatesStrategy = DuplicatesStrategy.EXCLUDE
        exclude("org/**")
        exclude("DebugProbesKt.bin")
        exclude("_COROUTINE/**")
        doLast {
            copy {
                from(archiveFile)
                into("${rootProject.projectDir}/build")
            }
        }
    }
    clean {
        delete("run")
    }
    build {
        dependsOn("shadowJar")
    }
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation(kotlin("reflect"))

    implementation(libs.kotlinx.coroutines)
    implementation(libs.kotlinx.serialization)
}
