package com.johnreah.jenkins

class Artifact {
    String groupId
    String artifactId
    String packaging
    String version
    String url

    @NonCPS
    String toString() {
        return "ArtifactId(${groupId}, ${artifactId}, ${packaging}, ${version}. ${url})"
    }
}
