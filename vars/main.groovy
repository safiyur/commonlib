#!groovy

def call ()
{
    node ('master')
            {
                bat "./gradlew compileJava"
            }
}
