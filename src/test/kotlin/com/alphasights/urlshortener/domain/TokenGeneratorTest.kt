package com.alphasights.urlshortener.domain

import org.junit.Test

class TokenGeneratorTest {

    val tokenGenerator = TokenGenerator()

    @Test
    fun generatesHash() {
        assert("55b207d6" == tokenGenerator.generate("http://www.google.com"))
    }
}
