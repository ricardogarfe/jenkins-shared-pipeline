@Library('ricardogarfe/jenkins-shared-pipeline') _
standardPipeline {
    projectName = "Project1"
    serverDomain = "Project1 Server Domain"
}
node {
    stage ('Notify') {
        notifySlack this, '${text}', '${slackURL}', '${channel}', '${attachments}' 	
    }
}
