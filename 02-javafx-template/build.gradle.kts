
plugins {
    java
    id("application")
}

application {
    mainClass.set("dev.blueberryzero.App")
}

repositories {
    mavenCentral()
}

ext {
    set( "myProp", "suh dude")
}

sourceSets {
    main {
        java {
            setSrcDirs(listOf("src"))
        }
    }
}

println("val of myProp: ${extra["myProp"]}")
