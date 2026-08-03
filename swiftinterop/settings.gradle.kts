/*
 * Copyright (c) 2023-2025 Oleg Yukhnevich. Use of this source code is governed by the Apache 2.0 license.
 */

import cksettings.*

pluginManagement {
    includeBuild("../build-settings")

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

projects("swiftinterop")
