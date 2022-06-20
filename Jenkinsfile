def gv
pipeline {
    agent any
    parameters{
        choice(name: "NEW_VERSION",choices:["1.3.0","1.4.0"],defaultValue: "1.1.0")
    }
    stages {
        stage("init") {
            steps {
                script {
                    gv = load "script.groovy"
                    echo "Script Loaded"
                }
            }
        }
        stage("build") {
            steps {
                script {
                    gv.buildApp()
                }
            }
        }
        stage("test") {
            when{
                expression{
                    BRANCH_NAME == "main" || BRANCH_NAME == "master "
                }
            }
            steps {
                script {
                    gv.testApp()
                }
            }
        }
        stage("deploy") {
            steps {
                script {
                    gv.deployApp()
                }
            }
         } 
    }
}
