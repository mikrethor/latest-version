package ca.mikrethor.latestversion

import ca.mikrethor.latestversion.model.Tag
import feign.Headers
import feign.Param
import feign.RequestLine

interface TagClient {

    @RequestLine("GET")
    @Headers("Authorization: token {token}")
    fun findAll(@Param("token") token:String):List<Tag>
}