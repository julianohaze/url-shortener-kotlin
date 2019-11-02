package com.alphasights.urlshortener.controller

import com.alphasights.urlshortener.controller.request.CreateUrlRequest
import com.alphasights.urlshortener.service.UrlService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 *   @author Juliano Silva
 */
@RestController
@RequestMapping("/api/url")
class UrlController(val urlService: UrlService) {

    @PostMapping
    fun createUrl(@RequestBody request: CreateUrlRequest): String {
        val url = urlService.create(request.url);
        return url.hash;
    }
}