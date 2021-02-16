package com.johnreah.jenkins

@NonCPS
public class Artifact {
    String groupId
    String artifactId
    String packaging
    String version
    String url

//    String toString() {
//        return "ArtifactId(" +
//                (groupId ?: 'xxx') + ", " +
//                (artifactId ?: 'xxx') + ", " +
//                (packaging ?: 'xxx') + ", " +
//                (version ?: 'xxx') + ", " +
//                (url ?: 'xxx') +
//                ")"
//    }

    String toString() {
        return "ArtifactId(${groupId}, ${artifactId}, ${packaging}, ${version}. ${url})"
    }
}
