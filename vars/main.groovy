def call ()
{
    //new appBuild()
    node
    {
    stage("Compile") {
        steps {
            bat "./gradlew compileJava"
        }
    }
    }
}