plugins {
    kotlin("jvm") version "2.1.20"
    application
}

group = "dev.dfreer"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

private val kotestVersion = "5.9.1"

dependencies {
    testImplementation("io.kotest:kotest-assertions-core-jvm:${kotestVersion}")
    testImplementation("io.kotest:kotest-runner-junit5-jvm:${kotestVersion}")
    testImplementation("io.kotest:kotest-property-jvm:${kotestVersion}")
}

application {
    mainClass = "MainKt"
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(21)
}
