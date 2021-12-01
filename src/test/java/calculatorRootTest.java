import com.it_academy.practice.junit_basics.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class calculatorRootTest implements VariableValues {
    @Test
    void RootOfPositiveIntegers() {
        assertEquals(Math.pow(POSITIVE_INTEGER1, POSITIVE_INTEGER2),
                new Calculator(VariableValues.POSITIVE_INTEGER1, POSITIVE_INTEGER2).calculate('s'));
    }

    @Test
    void RootOfNegativeIntegers() {
        assertEquals(Math.pow(NEGATIVE_INTEGER1, NEGATIVE_INTEGER2),
                new Calculator(VariableValues.NEGATIVE_INTEGER1, NEGATIVE_INTEGER2).calculate('s'));
    }

    @Test
    void RootOfPositiveAndNegativeIntegers() {
        assertEquals(Math.pow(POSITIVE_INTEGER1, NEGATIVE_INTEGER2),
                new Calculator(VariableValues.POSITIVE_INTEGER1, NEGATIVE_INTEGER2).calculate('s'));
    }

    @Test
    void RootOfPositiveFloats() {
        assertEquals(Math.pow(POSITIVE_FLOAT1, POSITIVE_FLOAT2),
                new Calculator((int) POSITIVE_FLOAT1, (int) POSITIVE_FLOAT2).calculate('s'));
    }

    @Test
    void RootOfNegativeFloats() {
        assertEquals(Math.pow(NEGATIVE_FLOAT1, NEGATIVE_FLOAT2),
                new Calculator((int) NEGATIVE_FLOAT1, (int) NEGATIVE_FLOAT2).calculate('s'));
    }

    @Test
    void RootOfPositiveAndNegativeFloats() {
        assertEquals(Math.pow(POSITIVE_FLOAT1, NEGATIVE_FLOAT2),
                new Calculator((int) POSITIVE_FLOAT1, (int) NEGATIVE_FLOAT2).calculate('s'));
    }

    @Test
    void RootOfPositiveIntegerAndNegativeFloat() {
        assertEquals(Math.pow(POSITIVE_INTEGER1, NEGATIVE_FLOAT2),
                new Calculator(POSITIVE_INTEGER1, (int) NEGATIVE_FLOAT2).calculate('s'));
    }

    @Test
    void RootOfZero() {
        assertEquals(Math.pow(ZERO, POSITIVE_INTEGER1),
                new Calculator(ZERO, POSITIVE_INTEGER1).calculate('s'));

    }

    @Test
    void ZeroRoot() {
        assertEquals(Math.pow(POSITIVE_INTEGER1, ZERO),
                new Calculator(POSITIVE_INTEGER1, ZERO).calculate('s'));

    }
}
