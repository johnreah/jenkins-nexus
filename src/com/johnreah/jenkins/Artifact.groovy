package com.johnreah.jenkins

public class Artifact {
    String groupId
    String artifactId
    String packaging
    String version
    String url

    String toString() {
        return "Artifact(${groupId}, ${artifactId}, ${packaging}, ${version}, ${url})"
    }
}
