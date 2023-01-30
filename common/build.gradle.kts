plugins {
    id("mckotlin.base")
    alias(libs.plugins.blossom)
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation(kotlin("reflect"))
}

blossom {
    replaceTokenIn("src/main/kotlin/me/adrianed/mckotlin/common/Constants.kt")
    replaceToken("{version}", project.version)
}

kotlin {
    jvmToolchain {
        languageVersion.set(JavaLanguageVersion.of(8))
    }
}