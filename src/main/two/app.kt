package main.two

import java.nio.ByteBuffer
import java.nio.CharBuffer
import java.nio.charset.Charset
import java.nio.charset.CodingErrorAction
import javax.xml.stream.events.Characters


fun main() {

    printOut("1234567890")

}

fun printOut(str : String) {
    val a = truncateBytes(str, Charset.defaultCharset(), 4)
    println(a)
    if (a != str) {
        printOut(str.drop(a.length))
    }
}


fun truncateBytes(s: String, charset: Charset, maxBytes: Int): String {
    val cb = CharBuffer.wrap(s)
    val bb = ByteBuffer.allocate(maxBytes)
    val encoder = charset.newEncoder()
        .onMalformedInput(CodingErrorAction.REPLACE)
        .onUnmappableCharacter(CodingErrorAction.REPLACE)
        .reset()
    val cr = encoder.encode(cb, bb, true)
    if (!cr.isOverflow) {
        return s
    }
    encoder.flush(bb)
    return cb.flip().toString()
}


