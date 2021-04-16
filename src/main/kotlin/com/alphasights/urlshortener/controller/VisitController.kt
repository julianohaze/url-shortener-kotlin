package com.alphasights.urlshortener.controller

import com.alphasights.urlshortener.service.VisitService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.servlet.http.HttpServletResponse

@RestController
@RequestMapping("/api/visits")
class VisitController(val visitService: VisitService) {

    @GetMapping("/{hash}")
    fun visit(@PathVariable hash: String, response: HttpServletResponse) {
        val visit = visitService.visit(hash)
        response.sendRedirect(visit.destination())
    }
}
