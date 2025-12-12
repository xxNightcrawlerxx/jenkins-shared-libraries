def call() {
    echo 'Deploying Django App'
    sh 'docker-compose down'
    sh 'docker-compose up -d'
}