plugins {
    id("mckotlin.base")
    alias(libs.plugins.blossom)
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation(kotlin("reflect"))

    implementation(libs.kotlinx.coroutines)
}

blossom {
    replaceTokenIn("src/main/kotlin/io/github/_4drian3d/mckotlin/common/Constants.kt")
    replaceToken("{version}", project.version)
}

kotlin {
    jvmToolchain {
        languageVersion.set(JavaLanguageVersion.of(8))
    }
}
