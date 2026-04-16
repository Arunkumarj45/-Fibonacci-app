pipeline {
    agent any

    stages {
        stage('Setup') {
            steps {
                echo 'Initializing Fibonacci parameters...'
            }
        }

        stage('Calculate') {
            steps {
                script {
                    echo 'Calculating Fibonacci sequence...'
                    def n = 10
                    def a = 0, b = 1
                    for (int i = 0; i < n; i++) {
                        echo "Term ${i}: ${a}"
                        def temp = a
                        a = b
                        b = temp + b
                    }
                }
            }
        }

        stage('Log Results') {
            steps {
                echo 'Sequence calculation complete.'
            }
        }
    }
}
