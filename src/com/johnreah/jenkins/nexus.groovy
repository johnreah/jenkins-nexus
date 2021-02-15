package com.johnreah.jenkins

import groovy.json.JsonSlurper
import groovy.transform.ToString

public class NexusHelper {

}

//@ToString
//class Artifact {
//    String groupId
//    String artifactId
//    String packaging
//    String version
//    String url
//}
//
//List<Artifact> artifacts = [
//        new Artifact(groupId: "com.mycompany.app", artifactId: "my-app", packaging: "jar"),
//        new Artifact(groupId: "com.google.collections", artifactId: "google-collections", packaging: "jar"),
//        new Artifact(groupId: "commons-logging", artifactId: "commons-logging-api", packaging: "jar")
//]
//
//class NexusHelper {
//
//}
//
//artifacts.each {
//    findInNexus it
//    println it
//}
//
//def findInNexus(Artifact artifact) {
//    def connection = new URL(""
//            + "http://localhost:8081/service/rest"
//            + '/v1/search'
//            + "?repository=maven-public"
//            + "&group=${artifact.groupId}"
//            + "&name=${artifact.artifactId}"
//            + "&sort=version"
//            + "&direction=desc")
//            .openConnection() as HttpURLConnection
//    connection.setRequestProperty('Accept', 'application/json')
//    if (connection.responseCode == 200) {
//        def json = connection.inputStream.withCloseable { new JsonSlurper().parse(it) }
//        def asset = json.items[0].assets.find{it.path.endsWith(artifact.packaging)}
//        artifact.version = asset.maven2.version
//        artifact.url = asset.downloadUrl
//    } else {
//        throw new Exception("connection error")
//    }
//}
