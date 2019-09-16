package ca.mikrethor.latestversion

import ca.mikrethor.latestversion.model.Tag
import feign.Headers
import feign.RequestLine

interface TagClient {

    @RequestLine("GET")
    @Headers("Authorization: token ADD YOUR GITHUB TOKEN HERE !!!!")
    fun findAll():List<Tag>
}