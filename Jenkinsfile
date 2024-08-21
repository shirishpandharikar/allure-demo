pipeline {
    agent any

    stages {
        stage('Checkout') {
            script {
                git branch: 'main',
                    url: 'https://github.com/shirishpandharikar/allure-demo.git'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean verify'
            }
            post {
                always {
                    allure includeProperties:
                     false,
                     jdk: '',
                     results: [[path: 'target/allure-results']]
                }
            }
        }
    }
}