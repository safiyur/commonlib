node
    {
    stage("Compile") {
        steps {
            bat "./gradlew compileJava"
        }
    }
    }