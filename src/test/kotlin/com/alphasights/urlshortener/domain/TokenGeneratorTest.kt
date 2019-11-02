package com.alphasights.urlshortener.domain

import org.junit.Test

/**
 *   @author Juliano Silva
 */
class TokenGeneratorTest {

    @Test
    fun generatesHash() {
        assert("55b207d6" == TokenGenerator.generate("http://www.google.com"))
    }
}