def compile()
{
    stage("compile") {
        bat "./gradlew compileJava"
    }
}