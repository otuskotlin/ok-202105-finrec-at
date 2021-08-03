rootProject.name = "ok-202105-finrec-at"

pluginManagement {
    plugins {
        val kotlinVersion: String by settings
        kotlin("jvm") version kotlinVersion
        kotlin("multiplatform") version kotlinVersion
    }
}

include("common")
include("m2l2-testing")
