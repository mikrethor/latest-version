package ca.mikrethor.springboot.latestversion

import feign.Feign
import feign.Logger
import feign.gson.GsonDecoder
import feign.gson.GsonEncoder
import feign.okhttp.OkHttpClient
import feign.slf4j.Slf4jLogger

class TagClientBuilder {

    companion object Factory {
        fun client(): TagClient = Feign.builder()
                .client(OkHttpClient())
                .encoder(GsonEncoder())
                .decoder(GsonDecoder())
                .logger(Slf4jLogger(TagClient::class.java))
                .logLevel(Logger.Level.FULL)
                .target(TagClient::class.java, "https://api.github.com/repos/spring-projects/spring-boot/tags")
    }
}