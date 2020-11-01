#!groovy

@NonCPS
def call ()
{
    node
            {
                stage("Compile") {
                    steps {
                        bat "./gradlew compileJava"
                    }
                }
            }
}