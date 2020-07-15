package com.cultivation.javaBasic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BooleanOperatorsTest {
    /*
        1.&&，||，&，|，==，!=的运算
        2.之前为空
        3.按照具体运算符的意义进行完成
        4.没有
     */
    @SuppressWarnings({"PointlessBooleanExpression", "ConstantConditions"})
    @Test
    void should_perform_logical_boolean_operations() {
        boolean[] actualResults = {
            true && true,
            true && false,
            false && false,
            true || true,
            true || false,
            false || false,
            true & true,
            true & false,
            false & false,
            true | true,
            true | false,
            false | false,
            3 == 7,
            4 != 5
        };

        // TODO: please modify the following code to pass the test
        // <--start
        boolean[] expectedResult = {true, false, false, true, true, false, true, false, false, true, true, false, false, true};
        // --end-->

        assertArrayEquals(expectedResult, actualResults);
    }

    /*
            1.&位运算符的运算
            2.之前为空
            3.&位于运算符，将其转化为二进制，并将value与mask进行补位，之后使用&方法，只有同时为1时，才是1
            4.没有
         */
    @Test
    void should_do_bitwise_and_boolean_operation() {
        final int value = 0x1234_abcd;
        final int mask = 0x000f_ff00;

        // TODO: please write down the result directly to pass the test.
        // <--start
        final int expected = 0x4ab00;
        // --end-->

        assertEquals(expected, value & mask);
    }

    /*
        1.|位运算符的运算
        2.之前为空
        3.&位于运算符，将其转化为二进制，并将value与mask进行补位，之后使用|方法，只有同时为0时，才是0
        4.没有
     */
    @Test
    void should_do_bitwise_or_boolean_operation() {
        final int value = 0x1234_0000;
        final int mask = 0x0000_abcd;

        // TODO: please write down the result directly to pass the test.
        // <--start
        final int expected = 0x1234_abcd;
        // --end-->

        assertEquals(expected, value | mask);
    }
    /*
        1.~位运算符的运算
        2.之前为空
        3.~位于运算符，将其转化为二进制，并对value进行符号位补位，之后进行取反运算。
        4.没有
     */
    @Test
    void should_do_bitwise_not_operation() {
        final int value = 0x0000_ffff;

        // TODO: please write down the result directly to pass the test.
        // <--start
        final int expected = -0x10000;
        // --end-->

        assertEquals(expected, ~value);
    }
}
