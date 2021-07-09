// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    repositories {
        jcenter()
        google()

    }
    dependencies {
        classpath ("com.android.tools.build:gradle:4.2.2")
        classpath ("com.google.gms:google-services:4.3.8")
        classpath ("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.20")
        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

allprojects {
    repositories {
        jcenter()
        google()
        maven { url = uri("https://jitpack.io") }
    }
}

tasks.register("clean",Delete::class){

    delete(rootProject.buildDir)

}