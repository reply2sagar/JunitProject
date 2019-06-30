pipeline {
    agent any
    environment {
       CXX = "g++-4.9.4"
       LD = "g++-4.9.4"
       ETL_MKL = 'true'
    }
    stages {
        stage ('git'){
            steps {
                checkout([
                    $class: 'GitSCM',
                    branches: scm.branches,
                    doGenerateSubmoduleConfigurations: false,
                    extensions: scm.extensions + [[$class: 'SubmoduleOption', disableSubmodules: false, recursiveSubmodules: true, reference: '', trackingSubmodules: false]],
                    submoduleCfg: [],
                    userRemoteConfigs: scm.userRemoteConfigs])
            }
        }
       
        stage ('build'){
            steps {
                echo 'build'
            }
        }
        stage ('test'){
            steps {
                mvn test
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
