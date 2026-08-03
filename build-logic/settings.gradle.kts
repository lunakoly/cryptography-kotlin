/*
 * Copyright (c) 2023-2024 Oleg Yukhnevich. Use of this source code is governed by the Apache 2.0 license.
 */

pluginManagement {
    includeBuild("../build-settings")
    includeBuild("../testtool")

    repositories {
        mavenCentral()
        gradlePluginPortal()
        maven("file:///Users/Nikolay.Lunyak/Documents/Projects/kotlin-worktrees/kotlin-platform-type-commonized-to-different-types/build/repo")
    }
}

plugins {
    id("cksettings.default")
}

dependencyResolutionManagement {
    versionCatalogs.named("libs") {
        from(files("../gradle/libs.versions.toml"))
    }

    repositories {
        maven("file:///Users/Nikolay.Lunyak/Documents/Projects/kotlin-worktrees/kotlin-platform-type-commonized-to-different-types/build/repo")
    }
}

rootProject.name = "build-logic"
