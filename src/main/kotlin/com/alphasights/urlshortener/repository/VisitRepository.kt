package com.alphasights.urlshortener.repository

import com.alphasights.urlshortener.domain.Visit

/**
 *   @author Juliano Silva
 */
interface VisitRepository {
    fun save(visit: Visit)
}