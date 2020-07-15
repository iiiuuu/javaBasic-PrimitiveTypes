package com.cultivation.javaBasic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.math.BigDecimal;
import java.math.RoundingMode;


class FloatingTypeTest {
    /*
        1. 考察浮点型转化int时，会丢失精度
        2. 之前为最大值
        3. float转化为int，会丢失精度，所以只拿整数位即可
        4. 没有
     */
    @Test
    void should_not_get_rounded_result_if_convert_floating_number_to_integer() {
        final float floatingPointNumber = 2.75f;
        final int integer = (int)floatingPointNumber;

        // TODO: Please change the result to pass the test.
        // <!--start
        final int expected = 2;
        // --end-->

        assertEquals(expected, integer);
    }
    /*
        1. 考察double的isInfinite与isNan使用
        2. 为空
        3. isInfinite当数值为正无穷还是负无穷都是true，否则为false，isNan如果值是一个非数字为true，否则为false
        4. 没有
     */
    @SuppressWarnings({"divzero", "NumericOverflow"})
    @Test
    void should_judge_special_double_cases() {
        assertTrue(isInfinity(1d / 0d));
        assertTrue(isInfinity(-1d / 0d));
        assertFalse(isInfinity(2d));
        assertFalse(isInfinity(Double.NaN));

        assertTrue(isNan(0d / 0d));
        assertFalse(isNan(Double.NEGATIVE_INFINITY));
        assertFalse(isNan(Double.POSITIVE_INFINITY));
    }
    /*
        1. 考察浮点型转化int时，会丢失精度
        2. 之前为最大值
        3. float转化为int，会丢失精度，所以只拿整数位即可
        4. 没有
     */
    @Test
    void should_not_round_number_when_convert_to_integer() {
        final float floatingPointNumber = 2.75f;
        final int integer = (int)floatingPointNumber;

        // TODO: Please change the result to pass the test.
        // <!--start
        final int expected = 2;
        // --end-->

        assertEquals(expected, integer);
    }
    /*
        1. double类型转化long
        2. 之前为最大值
        3. 需要进行四舍五入，之后进行转化
        4. 没有
     */
    @SuppressWarnings("unused")
    @Test
    void should_round_number() {
        final double floatingPointNumber = 2.75;

        // TODO: Please call some method to round the floating point number.
        // <!--start
        BigDecimal floatingPointNumberDecimal = new BigDecimal(2.75).setScale(0, RoundingMode.UP);
        final long rounded = floatingPointNumberDecimal.longValue();
        // --end-->

        assertEquals(3L, rounded);
    }

    @SuppressWarnings("unused")
    private boolean isNan(double realNumber) {
        // TODO: please find the method that performs this operation.
        return Double.isNaN(realNumber);
    }

    @SuppressWarnings("unused")
    private boolean isInfinity(double realNumber) {
        // TODO: please find the method that perform this operation.
        return Double.isInfinite(realNumber);
    }
}
