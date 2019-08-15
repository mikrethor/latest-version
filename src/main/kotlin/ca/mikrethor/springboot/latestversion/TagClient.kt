package ca.mikrethor.springboot.latestversion

import ca.mikrethor.springboot.latestversion.model.Tag
import feign.Headers
import feign.RequestLine

interface TagClient {

    @RequestLine("GET")
    @Headers("Authorization: token ADD YOUR GITHUB TOKEN HERE !!!!")
    fun findAll():List<Tag>
}