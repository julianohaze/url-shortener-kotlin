package com.alphasights.urlshortener.service

import com.alphasights.urlshortener.domain.Url
import com.alphasights.urlshortener.repository.UrlRepository
import org.springframework.stereotype.Service

@Service
class UrlService(val repository: UrlRepository) {

    fun create(originalUrl: String): Url {
        val url = Url.create(originalUrl)
        repository.save(url)
        return url
    }

    fun findByHash(hash: String): Url? = repository.findByHash(hash)
}
