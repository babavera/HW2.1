import com.it_academy.practice.junit_basics.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class calculatorExponentiationTest implements VariableValues {
    @Test
    void ExponentiationOfPositiveIntegers() {
        assertEquals(Math.pow(POSITIVE_INTEGER1, POSITIVE_INTEGER2),
                new Calculator(VariableValues.POSITIVE_INTEGER1, POSITIVE_INTEGER2).calculate('e'));
    }

    @Test
    void ExponentiationOfNegativeIntegers() {
        assertEquals(Math.pow(NEGATIVE_INTEGER1, NEGATIVE_INTEGER2),
                new Calculator(VariableValues.NEGATIVE_INTEGER1, NEGATIVE_INTEGER2).calculate('e'));
    }

    @Test
    void ExponentiationOfPositiveAndNegativeIntegers() {
        assertEquals(Math.pow(POSITIVE_INTEGER1, NEGATIVE_INTEGER2),
                new Calculator(VariableValues.POSITIVE_INTEGER1, NEGATIVE_INTEGER2).calculate('e'));
    }

    @Test
    void ExponentiationOfPositiveFloats() {
        assertEquals(Math.pow(POSITIVE_FLOAT1, POSITIVE_FLOAT2),
                new Calculator((int) POSITIVE_FLOAT1, (int) POSITIVE_FLOAT2).calculate('e'));
    }

    @Test
    void ExponentiationOfNegativeFloats() {
        assertEquals(Math.pow(NEGATIVE_FLOAT1, NEGATIVE_FLOAT2),
                new Calculator((int) NEGATIVE_FLOAT1, (int) NEGATIVE_FLOAT2).calculate('e'));
    }

    @Test
    void ExponentiationOfPositiveAndNegativeFloats() {
        assertEquals(Math.pow(POSITIVE_FLOAT1, NEGATIVE_FLOAT2),
                new Calculator((int) POSITIVE_FLOAT1, (int) NEGATIVE_FLOAT2).calculate('e'));
    }

    @Test
    void ExponentiationOfPositiveIntegerAndNegativeFloat() {
        assertEquals(Math.pow(POSITIVE_INTEGER1, NEGATIVE_FLOAT2),
                new Calculator(POSITIVE_INTEGER1, (int) NEGATIVE_FLOAT2).calculate('e'));
    }
    @Test
    void ExponentiationOfZero() {
        assertEquals(Math.pow(POSITIVE_INTEGER1, ZERO),
                new Calculator(POSITIVE_INTEGER1, ZERO).calculate('e'));
    }
    @Test
    void ZeroInExponentiation() {
        assertEquals(Math.pow(ZERO, POSITIVE_INTEGER1),
                new Calculator(ZERO, POSITIVE_INTEGER1).calculate('e'));
    }
}
