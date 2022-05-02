package pro.sky.skyprocalculator;

import net.bytebuddy.asm.Advice;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplParamTest {

    private final CalculatorServiceImpl calculatorServiceImpl = new CalculatorServiceImpl();

    //plus
    public static Stream<Arguments> plusParam() {

        return Stream.of(
                Arguments.of(44, 3, "47"),
                Arguments.of(5, 23, "28"));
    }

    @ParameterizedTest
    @MethodSource("plusParam")
    void plus(int num1, int num2, String str) {
        assertEquals(str, calculatorServiceImpl.plus(num1, num2));
    }

    //minus
    public static Stream<Arguments> minusParam() {

        return Stream.of(
                Arguments.of(44, 3, "41"),
                Arguments.of(5, 2, "3"));
    }

    @ParameterizedTest
    @MethodSource("minusParam")
    void minus(int num1, int num2, String str) {
        assertEquals(str, calculatorServiceImpl.minus(num1, num2));
    }

    //multiply
    public static Stream<Arguments> multiplyParam() {

        return Stream.of(
                Arguments.of(4, 3, "12"),
                Arguments.of(5, 2, "10"));
    }

    @ParameterizedTest
    @MethodSource("multiplyParam")
    void multiply(int num1, int num2, String str) {
        assertEquals(str, calculatorServiceImpl.multiply(num1, num2));
    }

    //div
    public static Stream<Arguments> divParam() {

        return Stream.of(
                Arguments.of(44, 4, "11"),
                Arguments.of(10, 2, "5"));
    }

    @ParameterizedTest
    @MethodSource("divParam")
    void div(int num1, int num2, String str) {
        assertEquals(str, calculatorServiceImpl.div(num1, num2));
    }


}
