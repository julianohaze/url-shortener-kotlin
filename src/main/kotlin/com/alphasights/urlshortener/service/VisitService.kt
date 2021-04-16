package com.alphasights.urlshortener.service

import com.alphasights.urlshortener.domain.Visit
import com.alphasights.urlshortener.exception.NotFoundException
import com.alphasights.urlshortener.repository.VisitRepository
import org.springframework.stereotype.Service

@Service
class VisitService(
    val urlService: UrlService,
    val visitRepository: VisitRepository
) {

    fun visit(hash: String): Visit {
        val url = urlService.findByHash(hash) ?: throw NotFoundException()
        val visit = Visit.createFor(url)
        visitRepository.save(visit)
        return visit
    }
}
