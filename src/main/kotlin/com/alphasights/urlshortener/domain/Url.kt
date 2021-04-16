package com.alphasights.urlshortener.domain

class Url private constructor(
    val originalUrl: String,
    val hash: String
) {

    companion object {
        fun create(originalUrl: String): Url {
            val url = Url(
                originalUrl,
                DomainRegistry.tokenGenerator.generate(originalUrl)
            )
            return DomainRegistry.urls.save(url)
        }

        fun findByHash(hash: String) = DomainRegistry.urls.findByHash(hash)
    }
}
