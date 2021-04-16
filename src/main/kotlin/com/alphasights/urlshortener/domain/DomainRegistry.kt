package com.alphasights.urlshortener.domain

import com.alphasights.urlshortener.repository.UrlRepository
import com.alphasights.urlshortener.repository.VisitRepository
import org.springframework.stereotype.Component

@Component
class DomainRegistry(
    urls: UrlRepository,
    visits: VisitRepository,
    tokenGenerator: TokenGenerator
) {
    init {
        Companion.urls = urls
        Companion.visits = visits
        Companion.tokenGenerator = tokenGenerator
    }

    companion object {
        lateinit var urls: UrlRepository
            private set
        lateinit var visits: VisitRepository
            private set
        lateinit var tokenGenerator: TokenGenerator
            private set
    }
}
