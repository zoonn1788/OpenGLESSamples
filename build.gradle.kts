buildscript {
    extra.apply {
        set("compose_version", "1.3.0-alpha03")
    }
}

plugins {
    id("com.android.application") version "7.2.2" apply false
    id("com.android.library") version "7.2.2" apply false
    id("org.jetbrains.kotlin.android") version "1.7.0" apply false
}

tasks.register<Delete>("clean") {
    delete(rootProject.buildDir)
}