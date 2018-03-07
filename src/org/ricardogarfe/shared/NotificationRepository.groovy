#!/usr/bin/env groovy
package org.ricardogarfe.shared

import groovy.json.JsonOutput

class NotificationRepository implements Serializable {

	static def notifySlack(script, text, slackURL, channel, attachments) {
	    def jenkinsIcon = 'https://wiki.jenkins-ci.org/download/attachments/2916393/logo.png'

	    def payload = JsonOutput.toJson([text: text,
	        channel: channel,
	        username: "Jenkins",
	        icon_url: jenkinsIcon,
	        attachments: attachments
	    ])

	    script.sh "curl -X POST --data-urlencode \'payload=${payload}\' ${slackURL}"
	}

}