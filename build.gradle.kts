plugins {
    kotlin("jvm") version "2.2.10"
}

group = "de.aptcode.cloud"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
}

subprojects {
    apply(plugin = "org.jetbrains.kotlin.jvm")

    repositories {
        mavenCentral()
    }

    dependencies {
        // Alle Submodule bekommen automatisch diese Dependencies
        implementation(kotlin("stdlib"))
        implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3") // Async Tasks
        implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.6.0") // JSON alternative
        implementation("com.google.code.gson:gson:2.10.1") // JSON Parsing
        // https://mvnrepository.com/artifact/com.google.inject/guice
        implementation("com.google.inject:guice:7.0.0")
        implementation("org.jline:jline:3.25.0") //Console Handler
        implementation("io.netty:netty-all:4.1.107.Final") //Socket Handler
        implementation("org.mongodb:mongodb-driver-sync:4.11.0") //Database Handler
        testImplementation("io.mockk:mockk:1.13.8")
        testImplementation(kotlin("test"))
    }

    tasks.withType<Test> {
        useJUnitPlatform()
    }
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(24)
}

