def call(String repoUrl, String branch) {
    echo 'Cloning the Repo for Building the Source Code'
    git url: "${repoUrl}", branch: "${branch}"
}