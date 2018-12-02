properties([
  	buildDiscarder(logRotator(numToKeepStr: '5')),
  	pipelineTriggers([snapshotDependencies()])])
node {
    stage ("Build") {
        checkout scm
        withMaven() {
            sh "./mvnw clean deploy"
        }
    }
}