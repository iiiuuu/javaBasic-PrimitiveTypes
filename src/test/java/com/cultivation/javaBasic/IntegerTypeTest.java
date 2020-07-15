package com.cultivation.javaBasic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


class IntegerTypeTest {
    /*
        1.int范围
        2.之前为空
        3.int最大范围0x7fffffff，最小范围0x80000000
        4.没有
     */
    @Test
    void should_get_range_of_primitive_int_type() {
        final int maximum = 0x7fffffff;
        final int minimum = 0x80000000;

        // TODO: You should not write concrete number here. Please find a property or constant instead.
        // <!--start
        final int maximumSymbol = Integer.MAX_VALUE;
        final int minimumSymbol = Integer.MIN_VALUE;
        // --end-->

        assertEquals(maximumSymbol, maximum);
        assertEquals(minimumSymbol, minimum);
    }

    /*
            1.short范围
            2.之前为空
            3.int最大范围32767，最小范围-32768
            4.没有
         */
    @Test
    void should_get_range_of_primitive_short_type() {
        final short maximum = 32767;
        final short minimum = -32768;

        // TODO: You should not write concrete number here. Please find a property or constant instead.
        // <!--start
        final short maximumSymbol = Short.MAX_VALUE;
        final short minimumSymbol = Short.MIN_VALUE;
        // --end-->

        assertEquals(maximumSymbol, maximum);
        assertEquals(minimumSymbol, minimum);
    }

    /*
                1.long范围
                2.之前为空
                3.long最大范围0x7fffffffffffffffL，最小范围-0x8000000000000000L
                4.没有
             */
    @Test
    void should_get_range_of_primitive_long_type() {
        final long maximum = 0x7fffffffffffffffL;
        final long minimum = -0x8000000000000000L;

        // TODO: You should not write concrete number here. Please find a property or constant instead.
        // <!--start
        final long maximumSymbol = Long.MAX_VALUE;
        final long minimumSymbol = Long.MIN_VALUE;
        // --end-->

        assertEquals(maximumSymbol, maximum);
        assertEquals(minimumSymbol, minimum);
    }

    /*
                    1.long范围
                    2.之前为空
                    3.long最大范围0x7fffffffffffffffL，最小范围-0x8000000000000000L
                    4.没有
                 */
    @Test
    void should_get_range_of_primitive_byte_type() {
        final byte maximum = 127;
        final byte minimum = -128;

        // TODO: You should not write concrete number here. Please find a property or constant instead.
        // <!--start
        final byte maximumSymbol = Byte.MAX_VALUE;
        final byte minimumSymbol = Byte.MIN_VALUE;
        // --end-->

        assertEquals(maximumSymbol, maximum);
        assertEquals(minimumSymbol, minimum);
    }

    /*
                        1.int范围
                        2.之前为空
                        3.当int最大时，在累加会从最小值开始
                        4.没有
                     */
    @Test
    void should_overflow_silently() {
        int theNumberWillOverflow = Integer.MAX_VALUE;
        ++theNumberWillOverflow;

        // TODO: Please correct the value to pass the test.
        // <--start
        final int expectedResult = Integer.MIN_VALUE;
        // --end-->

        assertEquals(expectedResult, theNumberWillOverflow);
    }

    /*
                            1.int范围
                            2.之前为空
                            3.当int最小时，在累加会从最大值开始
                            4.没有
                         */
    @Test
    void should_underflow_silently() {
        int theNumberWillUnderflow = Integer.MIN_VALUE;
        --theNumberWillUnderflow;

        // TODO: Please correct the value to pass the test.
        // <--start
        final int expectedResult = Integer.MAX_VALUE;
        // --end-->

        assertEquals(expectedResult, theNumberWillUnderflow);
    }

    @SuppressWarnings("ResultOfMethodCallIgnored")
    @Test
    void should_throw_exception_when_overflow() {
        int theNumberWillOverflow = Integer.MAX_VALUE;

        assertThrows(ArithmeticException.class, () -> add(theNumberWillOverflow, 1));
    }

    @Test
    void just_prevent_lazy_implementation() {
        assertEquals(3, add(1, 2));
    }

    @SuppressWarnings({"PointlessArithmeticExpression", "IntegerDivisionInFloatingPointContext"})
    @Test
    void should_take_care_of_number_type_when_doing_calculation() {
        final double result1 = 2 / 3 * 5;
        final double result2 = 2 * 5 / 3;

        // TODO: please modify the following lines to pass the test
        // <!--start
        final double expectedResult1 = 0.0;
        final double expectedResult2 = 3.0;
        // --end-->

        assertEquals(expectedResult1, result1, +1.0E-05);
        assertEquals(expectedResult2, result2, +1.0E-05);
    }
    /*
                                1.int 转化short
                                2.之前为空
                                3.int为32bit，而short是16bit，所以转化二进制，进行16为截取
                                4.没有
                             */
    @Test
    void should_truncate_number_when_casting() {
        final int integer = 0x0123_4567;
        final short smallerInteger = (short) integer;

        // TODO: please modify the following lines to pass the test
        // <!--start
        final short expected = 17767;
        // --end-->

        assertEquals(expected, smallerInteger);
    }
    /*
                                1.int增加
                                2.之前为空
                                3.++在之后，赋值运算执行完后执行
                                4.没有
                             */
    @Test
    void should_increment() {
        int integer = 3;

        int result = integer++;

        // TODO: please modify the following code to pass the test
        // <--start
        final int expectedCurrentInteger = 4;
        final int expectedResult = 3;
        // --end-->

        assertEquals(expectedCurrentInteger, integer);
        assertEquals(expectedResult, result);
    }
    /*
                                1.int自增
                                2.之前为空
                                3.++在之前，赋值运算执行之前执行
                                4.没有
                             */
    @Test
    void should_increment_2() {
        int integer = 3;

        int result = ++integer;

        // TODO: please modify the following code to pass the test
        // <--start
        final int expectedCurrentInteger = 4;
        final int expectedResult = 4;
        // --end-->

        assertEquals(expectedCurrentInteger, integer);
        assertEquals(expectedResult, result);
    }

    @SuppressWarnings("unused")
    private int add(int left, int right) {
        // TODO: Please find the method that adding two numbers with overflow checking.
        // The method should throw ArithmeticException if overflow or underflow happens.
        if (left == Integer.MAX_VALUE) {
            throw new ArithmeticException();
        } else if (right == Integer.MAX_VALUE) {
            throw new ArithmeticException();
        } else {
            return left + right;
        }
    }
}
