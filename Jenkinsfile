@Library('ricardogarfe/jenkins-shared-pipeline') _

properties([

    buildDiscarder(logRotator(artifactDaysToKeepStr: '', artifactNumToKeepStr: '', daysToKeepStr: '', numToKeepStr: '10')),

    parameters([
        string(defaultValue: 'Hello from pipeline library!', description: 'Message to slack', name: 'text'),
        string(defaultValue: '', description: 'Slack channel', name: 'channel'),
        string(defaultValue: '', description: 'Slack attachments', name: 'attachments'),
        string(defaultValue: '', description: 'Slack web url', name: 'slackURL')
    ])
])

standardPipeline {

    projectName = "Project1"
    serverDomain = "Project1 Server Domain"

}

node {
    stage ('Notify') {
        notifyToSlack '${text}', '${slackURL}', '${channel}', '${attachments}' 	
    }
}
