package ca.mikrethor.latestversion

fun main() {
    val springBootClient = TagClientBuilder.client("https://api.github.com/repos/spring-projects/spring-boot/tags")
    val springBootTags = springBootClient.findAll()
    val springBootTag = springBootTags.first { it.name.contains("RELEASE") }
    println(springBootTag.name.removePrefix("v"))

    val jibClient = TagClientBuilder.client("https://api.github.com/repos/GoogleContainerTools/jib/tags")
    val jibTags = jibClient.findAll()
    val jibTag = jibTags.first { it.name.contains("-maven") }
    println(jibTag.name.removePrefix("v").removeSuffix("-maven"))


}
