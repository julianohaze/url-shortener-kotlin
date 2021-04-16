package com.alphasights.urlshortener.domain

import org.junit.Test

class TokenGeneratorTest {

    @Test
    fun generatesHash() {
        assert("55b207d6" == TokenGenerator.generate("http://www.google.com"))
    }
}
