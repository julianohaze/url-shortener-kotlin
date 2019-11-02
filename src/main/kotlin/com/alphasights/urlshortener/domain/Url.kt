package com.alphasights.urlshortener.domain

/**
 *   @author Juliano Silva
 */
class Url private constructor(val originalUrl: String,
                              val hash: String) {

    companion object {
        fun create(originalUrl: String): Url {
            return Url(originalUrl,
                    TokenGenerator.generate(originalUrl))
        }
    }
}