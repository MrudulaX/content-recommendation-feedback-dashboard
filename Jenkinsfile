pipeline {

    agent any

    parameters {
        string(
            name: 'APP_PORT',
            defaultValue: '8080',
            description: 'Port on which the Spring Boot application will run'
        )
    }

    stages {

        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                echo "Building Content Recommendation Feedback Dashboard..."
                bat 'mvn clean compile'
            }
        }

        stage('Package') {
            steps {
                echo "Packaging Spring Boot application..."
                bat 'mvn clean package -DskipTests'
            }
        }

        stage('Deploy') {
            steps {
                echo "Deploying application..."
                echo "Application will use port: ${params.APP_PORT}"

                bat """
                    echo Deployment environment configured
                    echo APP_PORT=${params.APP_PORT}
                """
            }
        }
    }

    post {
        success {
            echo 'Pipeline completed successfully!'
        }

        failure {
            echo 'Pipeline failed!'
        }
    }
}