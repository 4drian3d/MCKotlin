plugins {
    id("mckotlin.base")
    alias(libs.plugins.blossom)
}

dependencies {
    implementation(kotlin("stdlib"))
}

blossom {
    replaceTokenIn("src/main/kotlin/me/adrianed/mckotlin/common/Constants.kt")
    replaceToken("{version}", project.version)
}
