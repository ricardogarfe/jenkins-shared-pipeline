#!/usr/bin/env groovy
import groovy.json.JsonOutput

def call(String text, String slackURL, String channel, String attachments) {

    def jenkinsIcon = 'https://wiki.jenkins-ci.org/download/attachments/2916393/logo.png'

    def payload = JsonOutput.toJson([text: text,
        channel: channel,
        username: "Jenkins",
        icon_url: "${jenkinsIcon}",
        attachments: attachments
    ])

    sh "curl -X POST --data-urlencode \'payload=${payload}\' ${slackURL}"
}
