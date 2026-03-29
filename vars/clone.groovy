def call(String repoUrl,STring branch) {
    git url: "${repoUrl}",
    branch: "${branch}"
}