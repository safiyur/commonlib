def call ()
{
    node
            {
                stage("Compile") {
                    bat "./gradlew compileJava"
                }
            }
}