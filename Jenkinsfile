pipeline {
    agent any
    environment{
        NEW_VERSION = "1.3.0"
    }
    stages {
        stage("build") {
            steps {
                echo "Building Stage"
            }
        }
        stage("test") {
            when{
                expression{
                    BRANCH_NAME == "main" || BRANCH_NAME == "master "
                }
            }
            steps {
                echo "Testing Stage"
                echo "Building version ${NEW_VERSION}"
            }
        }
        stage("deploy") {
            steps {
                echo "Deploying Stage"
            }
         } 
    }
}
