package ca.mikrethor.springboot.latestversion

fun main() {
    val client = TagClientBuilder.client()
    val tags = client.findAll()
    val tag = tags.first { it.name.contains("RELEASE") }
    println(tag.name.substring(1))
}
