#!groovy

def call() {
    node {
        stage('compile')
                {
                    bat "./gradlew compileJava"
                }
    }
}
