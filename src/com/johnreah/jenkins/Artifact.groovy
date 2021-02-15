package com.johnreah.jenkins

public class Artifact {
    String groupId
    String artifactId
    String packaging
    String version
    String url

    String toString() {
        return sprintf("ArtifactId(%s, %s, %s, %s, %s)",
                groupId ?: 'xxx',
                artifactId ?: 'xxx',
                packaging ?: 'xxx',
                version ?: 'xxx',
                url ?: 'xxx')
    }
}
