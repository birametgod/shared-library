def call(String buildStatus) {
    if (buildStatus == 'SUCCESS') {
        success {
            slackSend (color: 'good', message: "Pipeline completed successfully from shared library! ")
        }
    } else {
        failure {
            slackSend (color: 'danger', message: "Pipeline failed from shared library!")
        }
    }
}