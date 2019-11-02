package com.alphasights.urlshortener.exception

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus
import java.lang.RuntimeException

/**
 *   @author Juliano Silva
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
class NotFoundException : RuntimeException()