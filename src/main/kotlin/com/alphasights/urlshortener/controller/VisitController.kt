package com.alphasights.urlshortener.controller

import com.alphasights.urlshortener.domain.Url
import com.alphasights.urlshortener.domain.Visit
import com.alphasights.urlshortener.exception.NotFoundException
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.servlet.http.HttpServletResponse

@RestController
@RequestMapping("/api/visits")
class VisitController {

    @GetMapping("/{hash}")
    fun visit(@PathVariable hash: String, response: HttpServletResponse) {
        val url = Url.findByHash(hash) ?: throw NotFoundException()
        val visit = Visit.createFor(url)
        response.sendRedirect(visit.destination())
    }
}
