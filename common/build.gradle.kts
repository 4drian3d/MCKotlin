plugins {
    kotlin("jvm")
    id("net.kyori.blossom") version "1.3.1"
}

dependencies {
    implementation(kotlin("stdlib"))
}

blossom {
    replaceTokenIn("src/main/kotlin/me/adrianed/mckotlin/common/Constants.kt")
    replaceToken("{version}", project.version)
}
