pipeline {
    agent any
    environment {
       CXX = "g++-4.9.4"
       LD = "g++-4.9.4"
       ETL_MKL = 'true'
        PATH = "/usr/local/Cellar/maven/3.6.0/libexec/bin:$PATH"
    }
    
    
    stages {
        
       
        stage ('build'){
            steps {
                sh "whoami"
               

                sh "mvn compile" 
            }
        }
        stage ('test'){
            steps {
                mvn test
            }
            
            post {
                always {
                    junit 'target/surefire-reports/*.xml' 
                }
            }
        }
        
        stage ('sonar-master'){
            when {
                branch 'master'
            }
            steps {
                sh "/opt/sonar-runner/bin/sonar-runner"
            }
        }
        stage ('sonar-branch'){
            when {
                not {
                    branch 'master'
                }
            }
            steps {
                sh "/opt/sonar-runner/bin/sonar-runner -Dsonar.branch=${env.BRANCH_NAME}"
            }
        }
        stage ('bench'){
            steps {
                build job: 'etl - benchmark', wait: false
            }
        }
    }
    post {
        always {
            step([$class: 'Mailer',
                notifyEveryUnstableBuild: true,
                recipients: "reply2sagar@gmail.com",
                sendToIndividuals: true])
        }
    }
}
