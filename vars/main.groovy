#!groovy

def call ()
{
    node('master')
        {
            stage("compile") {
            bat "./gradlew compileJava"
        }
    }
}