plugins {
    java
    kotlin("multiplatform")
}

dependencies {
    val junitJupiterApi: String by project

    testImplementation("org.junit.jupiter:junit-jupiter-api:$junitJupiterApi")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

kotlin {

    js {
        browser()
    }
    jvm {}

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(kotlin("stdlib-common"))
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test-common"))
                implementation(kotlin("test-annotations-common"))
            }
        }

        val jsMain by getting {
            dependencies {
                implementation(kotlin("stdlib-js"))
            }
        }
        val jsTest by getting {
            dependencies {
                implementation(kotlin("test-js"))
            }
        }

        val jvmMain by getting {
            dependencies {
                implementation(kotlin("stdlib-jdk8"))
            }
        }
        val jvmTest by getting {
            dependencies {
                implementation(kotlin("test-junit5"))
            }
        }
    }
}

tasks.getByName<Test>("jvmTest") {
    useJUnitPlatform()
}
