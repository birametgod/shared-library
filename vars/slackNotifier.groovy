def call(String buildStatus) {
    // currentBuild.result is null while the build is still successful
    buildStatus = buildStatus ?: 'SUCCESS'

    if (buildStatus == 'SUCCESS') {
        slackSend (color: 'good', message: "Pipeline completed successfully from shared library! ")
    } else {
        slackSend (color: 'danger', message: "Pipeline failed from shared library!")
    }
}
