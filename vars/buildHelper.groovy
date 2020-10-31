def compile()
{
    stage("Compile") {
        steps {
            bat "./gradlew compileJava"
        }
    }
}