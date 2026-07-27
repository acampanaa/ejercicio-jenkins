pipeline {
    agent any

    tools {
        maven 'maven-jenkins'
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/acampanaa/ejercicio-jenkins.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Analisis SonarQube') {
            steps {
                withSonarQubeEnv('sonarqube') {
                    sh 'mvn sonar:sonar -Dsonar.projectKey=mi-app -Dsonar.projectName=mi-app'
                }
            }
        }

        stage('Quality Gate') {
            steps {
                timeout(time: 5, unit: 'MINUTES') {
                    waitForQualityGate abortPipeline: true
                }
            }
        }
    }

    post {
        always {
            junit '**/target/surefire-reports/*.xml'
            recordCoverage(tools: [[parser: 'JACOCO', pattern: '**/target/site/jacoco/jacoco.xml']])
        }
        success {
            echo 'Pipeline exitoso: el codigo cumple el Quality Gate.'
        }
        failure {
            echo 'Pipeline fallido: revisar pruebas o Quality Gate.'
        }
    }
}
