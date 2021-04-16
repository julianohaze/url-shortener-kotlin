package com.alphasights.urlshortener.domain

import java.util.*

class Visit private constructor(
    val id: String,
    private val url: Url
) {

    companion object {
        fun createFor(url: Url) = Visit(
            id = UUID.randomUUID().toString(),
            url = url
        )
    }

    fun destination() = url.originalUrl
}
