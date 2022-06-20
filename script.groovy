def buildApp(){
    echo "building the application"
}
def testApp(){
    echo "Testing Stage"
    echo "Building version ${params.NEW_VERSION}"
}
def deployApp(){
    echo "Deploying Stage"
}
return this