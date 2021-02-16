package com.johnreah.jenkins

/**
 * POJO to model attributes of an artifact held in Nexus. groupId, artifactId
 * and packaging are from the POM; version and url are from Nexus.
 */
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
