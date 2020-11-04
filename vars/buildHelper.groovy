#!groovy

def compile() {
    stage("compile") {
        echo "Compiling the app"
        bat "./gradlew compileJava"
    }
}

def doPackage() {
    stage("Package") {
        echo "Packaging starts"
        bat "./gradlew build"
    }
}

def doPush() {
    stage("Docker Push") {
        echo "Pushing to Docker Hub"
        bat "docker login -u safik1 -p Safrah@165"
        bat "docker push safik1/calculator"
    }
}

def buildImage() {
    stage("Docker build") {
        echo "Build Docker Image"
        bat "docker build -t safik1/calculator ."
    }
}

def deployToStage() {
    stage("Deploy to Staging") {
        echo "Deploy to Staging"
        bat "docker run -d --rm -p 8765:8080 --name calculator safik1/calculator"
    }
}

def cleanup() {
    stage("cleanup") {
        echo "docker cleanup"
        bat "docker stop calculator"
    }
}