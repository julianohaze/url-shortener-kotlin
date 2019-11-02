package com.alphasights.urlshortener.domain

import java.lang.Long.toHexString
import java.util.zip.Adler32


/**
 *   @author Juliano Silva
 */
class TokenGenerator {

    companion object {
        fun generate(url: String): String {
            val checksum = Adler32()

            val bytes = url.toByteArray()
            checksum.update(bytes, 0, bytes.size)

            return toHexString(checksum.value)
        }
    }
}