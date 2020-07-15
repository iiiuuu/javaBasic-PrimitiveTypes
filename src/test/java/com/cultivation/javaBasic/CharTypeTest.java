package com.cultivation.javaBasic;

import com.cultivation.javaBasic.util.EscapedChars;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CharTypeTest {
    /*
        1.考察char进制对应的ASCII对照
        2.之前为空
        3.根据对应十六进制查询ASCII表，并进行转义
        4.没有
     */
    @Test
    void should_describe_escaped_chars() {
        // TODO: please modify the following code to pass the test
        // <--start
        final char backspace = '\b';
        final char tab = '\t';
        final char lineFeed = '\n';
        final char carriageReturn = '\r';
        final char doubleQuote = '\"';
        final char singleQuote = '\'';
        final char backslash = '\\';
        // --end-->

        assertEquals(EscapedChars.BACKSPACE.getValue(), backspace);
        assertEquals(EscapedChars.TAB.getValue(), tab);
        assertEquals(EscapedChars.LINE_FEED.getValue(), lineFeed);
        assertEquals(EscapedChars.CARRIAGE_RETURN.getValue(), carriageReturn);
        assertEquals(EscapedChars.DOUBLE_QUOTE.getValue(), doubleQuote);
        assertEquals(EscapedChars.SINGLE_QUOTE.getValue(), singleQuote);
        assertEquals(EscapedChars.BACKSLASH.getValue(), backslash);
    }
}
