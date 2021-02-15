package com.johnreah.jenkins

public class Artifact {
    String groupId
    String artifactId
    String packaging
    String version
    String url

    String toString() {
        println sprintf("ArtifactId(%s)", groupId)
        println sprintf("ArtifactId(%s)", artifactId)
        println sprintf("ArtifactId(%s)", packaging)
        println sprintf("ArtifactId(%s)", version)
        println sprintf("ArtifactId(%s)", url)
        return sprintf("ArtifactId(%s, %s, %s, %s, %s)", groupId, artifactId, packaging, version, url)
    }
}
