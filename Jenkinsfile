node {
    stage ("Build") {
        checkout scm
        withMaven(maven:"maven-3.5.0") {
            sh "mvn clean install"
        }
    }
}