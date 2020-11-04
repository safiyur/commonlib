#!groovy

def call() {
    echo "in constructor"
}

def compile()
{
    node {
        stage('compile')
                {
                    bat "./gradlew compileJava"
                }
    }
}
