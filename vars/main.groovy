def call ()
{
    stage("compile") {
        echo "hello app"
        bat "./gradlew compileJava"
    }
}