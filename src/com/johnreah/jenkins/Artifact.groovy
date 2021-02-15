package com.johnreah.jenkins

public class Artifact {
    String groupId
    String artifactId
    String packaging
    String version
    String url

    String toString() {
        return sprintf("ArtifactId(%s)", groupId)
        return sprintf("ArtifactId(%s)", artifactId)
        return sprintf("ArtifactId(%s)", packaging)
        return sprintf("ArtifactId(%s)", version)
        return sprintf("ArtifactId(%s)", url)
        return sprintf("ArtifactId(%s, %s, %s, %s, %s)", groupId, artifactId, packaging, version, url)
    }
}
