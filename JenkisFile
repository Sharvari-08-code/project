pipeline {
    agent any

    stages {

        stage('Compile') {
            steps {
                sh 'javac Calci.java'
            }
        }

        stage('Run') {
            steps {
                sh 'java Calci'
            }
        }

    }
}
