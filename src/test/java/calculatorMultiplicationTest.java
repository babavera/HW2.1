import com.it_academy.practice.junit_basics.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class calculatorMultiplicationTest implements VariableValues {
    @Test
    void MultiplicationOfPositiveIntegers() {
        assertEquals(POSITIVE_INTEGER1 * POSITIVE_INTEGER2,
                new Calculator(POSITIVE_INTEGER1, POSITIVE_INTEGER2).calculate('*'));
    }
    @Test
    void MultiplicationOfNegativeIntegers() {
        assertEquals(NEGATIVE_INTEGER1 * NEGATIVE_INTEGER2,
                new Calculator(NEGATIVE_INTEGER1, NEGATIVE_INTEGER2).calculate('*'));

    }
    @Test
    void MultiplicationOfPositiveAndNegativeIntegers() {
        assertEquals(POSITIVE_INTEGER1 * NEGATIVE_INTEGER2,
                new Calculator(POSITIVE_INTEGER1, NEGATIVE_INTEGER2).calculate('*'));

    }
    @Test
    void MultiplicationOfPositiveFloats() {
        assertEquals(POSITIVE_FLOAT1 * POSITIVE_FLOAT2,
                new Calculator((int)POSITIVE_FLOAT1, (int)POSITIVE_FLOAT2).calculate('*'));

    }
    @Test
    void MultiplicationOfNegativeFloats() {
        assertEquals(NEGATIVE_FLOAT1 * NEGATIVE_FLOAT2,
                new Calculator((int)NEGATIVE_FLOAT1, (int)NEGATIVE_FLOAT2).calculate('*'));
    }
    @Test
    void MultiplicationOfPositiveAndNegativeFloats() {
        assertEquals(POSITIVE_FLOAT1 * NEGATIVE_FLOAT2,
                new Calculator((int)POSITIVE_FLOAT1, (int)NEGATIVE_FLOAT2).calculate('*'));
    }
    @Test
    void MultiplicationOfPositiveIntegerAndNegativeFloat() {
        assertEquals(POSITIVE_FLOAT1 * NEGATIVE_FLOAT2,
                new Calculator((int)POSITIVE_FLOAT1, (int)NEGATIVE_FLOAT2).calculate('*'));
    }

}
