@Library('ricardogarfe/jenkins-shared-pipeline') _
standardPipeline {

    projectName = "Project1"
    serverDomain = "Project1 Server Domain"

}

node {
    stage ('Notify') {
        notifyToSlack '${text}', '${slackURL}', '${channel}', '${attachments}' 	
    }
}
