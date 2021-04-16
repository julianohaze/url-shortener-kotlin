package com.alphasights.urlshortener.repository

import com.alphasights.urlshortener.domain.Url

interface UrlRepository {
    fun save(url: Url): Url

    fun findByHash(hash: String): Url?
}
