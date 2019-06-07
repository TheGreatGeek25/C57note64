/*
 * This file was generated by the Gradle 'init' task.
 *
 * This is a general purpose Gradle build.
 * Learn how to create Gradle builds at https://guides.gradle.org/creating-new-gradle-builds/
 */


plugins {
    java
    application
    id("org.openjfx.javafxplugin")// version "0.0.7" //Plugin request for plugin already on the classpath must not include a version
}

repositories {
    jcenter()
}

dependencies {

}

javafx {
    version = "12.0.1"
    modules("javafx.controls", "javafx.web")
}

application {
    mainClassName = "bytenote.update.UpdateMain"
}