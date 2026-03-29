def call(String type="node") {
    if (type == "node") {
        sh "npm test"
    } else if (type == "maven") {
        sh "mvn test"
    }
}