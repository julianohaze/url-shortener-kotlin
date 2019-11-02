package com.alphasights.urlshortener.repository

import com.alphasights.urlshortener.domain.Visit
import org.springframework.stereotype.Repository

@Repository
class InMemoryVisitRepository : VisitRepository {

    val visits = mutableMapOf<String, Visit>()

    override fun save(visit: Visit) {
        visits[visit.id] = visit
    }
}