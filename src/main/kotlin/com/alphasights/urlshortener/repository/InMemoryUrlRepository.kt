package com.alphasights.urlshortener.repository

import com.alphasights.urlshortener.domain.Url
import org.springframework.stereotype.Repository

/**
 *   @author Juliano Silva
 */
@Repository
class InMemoryUrlRepository : UrlRepository {
    val urls = HashMap<String, Url>()

    override fun save(url: Url) {
        urls[url.hash] = url
    }

    override fun findByHash(hash: String): Url? = urls[hash]

}