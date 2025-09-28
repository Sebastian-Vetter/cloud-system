plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}
rootProject.name = "cloud-system"
include("core-app")
include("worker-app")
include("common")
include("cloud-api")