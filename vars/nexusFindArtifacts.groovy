#!/usr/bin/env groovy
import com.johnreah.jenkins.Artifact
import com.johnreah.jenkins.NexusHelper

/**
 * Calls Nexus to request versions and URLs of the most recent artifacts in the list.
 * Fields required on input for each artifact are groupId, artifactId and packaging;
 * the version and url fields will be populated on return, if available.
 *
 * @param nexusApiRoot
 * @param artifacts
 * @return
 */
def call(String nexusApiRoot, List<Artifact> artifacts) {

    NexusHelper nexusHelper = new NexusHelper(apiRoot: nexusApiRoot)
    artifacts.each {
        nexusHelper.findInNexus it
        println "Artifact: " + it
    }
}

