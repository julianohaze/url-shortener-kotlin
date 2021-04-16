package com.alphasights.urlshortener.repository

import com.alphasights.urlshortener.domain.Visit

interface VisitRepository {
    fun save(visit: Visit)
}
