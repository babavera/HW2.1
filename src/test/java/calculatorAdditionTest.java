import com.it_academy.practice.junit_basics.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class calculatorAdditionTest implements VariableValues {
    @Test
    void AdditionOfPositiveIntegers() {
        assertEquals(POSITIVE_INTEGER1 + POSITIVE_INTEGER2,
                new Calculator(VariableValues.POSITIVE_INTEGER1, POSITIVE_INTEGER2).calculate('+'));
    }

    @Test
    void AdditionOfNegativeIntegers() {
        assertEquals(POSITIVE_INTEGER1 + NEGATIVE_INTEGER2,
                new Calculator(POSITIVE_INTEGER1, NEGATIVE_INTEGER2).calculate('+'));
    }

    @Test
    void AdditionOfPositiveAndNegativeIntegers() {
        assertEquals(NEGATIVE_INTEGER1 + NEGATIVE_INTEGER2,
                new Calculator(NEGATIVE_INTEGER1, NEGATIVE_INTEGER2).calculate('+'));
    }

    @Test
    void AdditionOfPositiveFloats() {
        assertEquals(POSITIVE_FLOAT1 + POSITIVE_FLOAT2,
                new Calculator((int) POSITIVE_FLOAT1, (int) POSITIVE_FLOAT2).calculate('+'));
    }

    @Test
    void AdditionOfNegativeFloats() {
        assertEquals(NEGATIVE_FLOAT1 + NEGATIVE_FLOAT2,
                new Calculator((int) NEGATIVE_FLOAT1, (int) NEGATIVE_FLOAT2).calculate('+'));
    }

    @Test
    void AdditionOfPositiveAndNegativeFloats() {
        assertEquals(POSITIVE_FLOAT1 + NEGATIVE_FLOAT2,
                new Calculator((int) POSITIVE_FLOAT1, (int) NEGATIVE_FLOAT2).calculate('+'));
    }

    @Test
    void AdditionOfPositiveIntegerAndNegativeFloat() {
        assertEquals(POSITIVE_INTEGER1 + NEGATIVE_FLOAT2,
                new Calculator(POSITIVE_INTEGER1, (int) NEGATIVE_FLOAT2).calculate('+'));
    }
}
