def call ()
{
    node
        {
            stage("compile") {
            echo "hello app"
            bat "./gradlew compileJava"
        }
    }
}