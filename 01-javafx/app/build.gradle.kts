/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    id("buildlogic.java-application-conventions")
    id("org.openjfx.javafxplugin") version "0.1.0"
}

dependencies {
    implementation("org.openjfx:javafx:24-ea+5")
    implementation("org.apache.commons:commons-text")
    implementation(project(":utilities"))
}

// extra["javafxVersion"] = "17.0.2" 

javafx {
    version = "17.0.2"
    modules("javafx.controls", "javafx.graphics")
}

tasks {
    register("logJavaFXVersion") {
        val javafxVersion = project.extra["javafxVersion"] as String
        // val javafxVersion = project.extra["javafxVersion"] as String
        println("JavaFX Version: $javafxVersion")
    }
}

application {
    // Define the main class for the application.
    mainClass = "org.example.app.App"
}
