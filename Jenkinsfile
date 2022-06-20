def gv
pipeline {
    agent any
    parameters{
        choice(name: "NEW_VERSION",choices:["1.3.0","1.4.0","1.1.0"])
        booleanParam (name: "execTests", defaultValue: true)
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
                    ${execTests} == true
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
