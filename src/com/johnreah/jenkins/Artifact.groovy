package com.johnreah.jenkins

import groovy.transform.ToString

//@ToString
public class Artifact {
    String groupId
    String artifactId
    String packaging
    String version
    String url

    String toString() {
        return "TOSTRING artifactId: " + artifactId
    }
}
