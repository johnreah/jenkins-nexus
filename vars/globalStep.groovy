#!/usr/bin/env groovy
import com.johnreah.jenkins.Artifact

def call(List<Artifact> artifacts) {
    artifacts.each {
        println "Artifact: " + it.artifactId
    }
}

