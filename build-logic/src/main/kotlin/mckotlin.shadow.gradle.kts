plugins{
    id("com.github.johnrengelman.shadow")
    id("mckotlin.base")
}

fun String.firstUppercase(): String {
    val st = this.substring(9)
    val char = st[0]
    return char.toUpperCase() + st.substring(1)
}

tasks {
    shadowJar {
        archiveFileName.set("MCKotlin${project.name.firstUppercase()}-${project.version}.jar")
        duplicatesStrategy = DuplicatesStrategy.EXCLUDE
        exclude("org/**")
    }
    clean {
        delete("run")
    }
    build {
        dependsOn("shadowJar")
    }
}

dependencies {
    shadow(project(":mckotlin-common"))
}
