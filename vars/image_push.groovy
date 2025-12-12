def call(String imageName) {
    echo 'Pushing Docker image for Django Notes App'

    withCredentials([usernamePassword(credentialsId: 'dockerhub-creds', passwordVariable: 'dockerHubPassword', usernameVariable: 'dockerHubUsername')]) {
        sh "docker login -u ${env.dockerHubUsername} -p ${env.dockerHubPassword}"
        sh "docker tag ${imageName}:latest ${env.dockerHubUsername}/${imageName}:latest"
        sh "docker push ${env.dockerHubUsername}/${imageName}:latest"
    }
}