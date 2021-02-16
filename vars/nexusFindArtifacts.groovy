#!/usr/bin/env groovy
import com.johnreah.jenkins.Artifact
import com.johnreah.jenkins.NexusHelper
import groovy.json.JsonSlurper

def call(String nexusApiRoot, List<Artifact> artifacts) {

    NexusHelper nexusHelper = new NexusHelper(apiRoot: nexusApiRoot)
    artifacts.each {
        nexusHelper.findInNexus it
        println "Artifact: " + it
    }
}

