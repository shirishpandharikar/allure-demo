pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                git 'https://github.com/shirishpandharikar/allure-demo.git'
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