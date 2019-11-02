package com.alphasights.urlshortener.repository

import com.alphasights.urlshortener.domain.Url

/**
 *   @author Juliano Silva
 */
interface UrlRepository {
    fun save(url: Url)

    fun findByHash(hash: String): Url?
}