import com.it_academy.practice.junit_basics.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class calculatorDivisionTest implements VariableValues {
    @Test
    void DivisionOfPositiveIntegers() {
        assertEquals((float) POSITIVE_INTEGER1 / (float)POSITIVE_INTEGER2,
                new Calculator(POSITIVE_INTEGER1, POSITIVE_INTEGER2).calculate('/'));
    }
    @Test
    void DivisionOfNegativeIntegers() {
        assertEquals( (float) NEGATIVE_INTEGER1 / (float)NEGATIVE_INTEGER2,
                new Calculator(NEGATIVE_INTEGER1, NEGATIVE_INTEGER2).calculate('/'));
    }
    @Test
    void DivisionOfPositiveAndNegativeIntegers() {
        assertEquals( (float)POSITIVE_INTEGER1 / (float)NEGATIVE_INTEGER1,
                new Calculator(POSITIVE_INTEGER1, NEGATIVE_INTEGER1).calculate('/'));
    }
    @Test
    void DivisionOfPositiveFloats() {
        assertEquals(POSITIVE_FLOAT1 / POSITIVE_FLOAT2,
                new Calculator((int)POSITIVE_FLOAT1, (int) POSITIVE_FLOAT2).calculate('/'));
    }
    @Test
    void DivisionOfNegativeFloats() {
        assertEquals(NEGATIVE_FLOAT1/ NEGATIVE_FLOAT2,
                new Calculator((int)NEGATIVE_FLOAT1, (int)NEGATIVE_FLOAT2).calculate('/'));
    }
    @Test
    void DivisionOfPositiveAndNegativeFloats() {
        assertEquals(POSITIVE_FLOAT1/ NEGATIVE_FLOAT2,
                new Calculator((int)POSITIVE_FLOAT1, (int)NEGATIVE_FLOAT2).calculate('/'));
    }
    @Test
    void DivisionOfPositiveIntegerAndNegativeFloat() {
        assertEquals(POSITIVE_INTEGER1/ NEGATIVE_FLOAT2,
                new Calculator(POSITIVE_INTEGER1, (int)NEGATIVE_FLOAT2).calculate('/'));
    }
    @Test
    public void DivisionByZero() {
        assertThrows(ArithmeticException.class, () -> new Calculator(POSITIVE_INTEGER1,ZERO).calculate('/'));
    }
}
