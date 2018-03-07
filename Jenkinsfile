@Library('ricardogarfe/jenkins-shared-pipeline') _
node {
    stage ('Pre-stage') {
        sh "echo 'pre-stage shared library build'"
    }
}
standardPipeline {
    projectName = "Project1"
    serverDomain = "Project1 Server Domain"
}
