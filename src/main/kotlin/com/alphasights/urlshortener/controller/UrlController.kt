package com.alphasights.urlshortener.controller

import com.alphasights.urlshortener.controller.request.CreateUrlRequest
import com.alphasights.urlshortener.domain.Url
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/urls")
class UrlController {

    @PostMapping
    fun createUrl(@RequestBody request: CreateUrlRequest): String {
        val url = Url.create(request.url)
        return url.hash
    }
}
