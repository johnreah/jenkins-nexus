package com.johnreah.jenkins

import groovy.json.JsonSlurper
import groovy.transform.ToString

public class NexusHelper {

    String apiRoot

    @NonCPS
    def findInNexus(Artifact artifact) {
        def connection = new URL(""
                + apiRoot //"http://172.17.0.2:8081/service/rest"
                + '/v1/search'
                + "?repository=maven-public"
                + "&group=${artifact.groupId}"
                + "&name=${artifact.artifactId}"
                + "&sort=version"
                + "&direction=desc")
                .openConnection() as HttpURLConnection
        connection.setRequestProperty('Accept', 'application/json')
        if (connection.responseCode == 200) {
            def json = connection.inputStream.withCloseable { new JsonSlurper().parse(it) }
            def asset = json.items[0].assets.find{it.path.endsWith(artifact.packaging)}
            artifact.version = asset.maven2.version
            artifact.url = asset.downloadUrl
        } else {
            throw new Exception("connection error")
        }
    }
}
