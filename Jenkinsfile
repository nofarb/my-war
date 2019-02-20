properties([
  	buildDiscarder(logRotator(numToKeepStr: '5')),
  	pipelineTriggers([snapshotDependencies()])])
node {
    stage ("Build") {
        echo "changed it"
        checkout scm
        withMaven() {
            sh "./mvnw clean deploy"
        }
    }
}
