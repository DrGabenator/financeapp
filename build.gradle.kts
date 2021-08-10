buildscript{

    val kotlin_version by extra("1.5.21")
    repositories{
        google()
        jcenter()
    }
    dependencies{

        classpath("com.android.tools.build:gradle:4.2.2")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.21")
    }
}
allprojects {
    repositories {
        google()
        jcenter()
    }
}
tasks.create<Delete>("clean"){
    delete(rootProject.buildDir)
}