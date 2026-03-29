def call(String type="node") {
    if (type == "node") {
        sh "npm install"
        sh "npm run build"
    } else if (type == "maven") {
        sh "mvn clean package"
    }
}