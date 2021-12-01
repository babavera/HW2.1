import com.it_academy.practice.junit_basics.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class calculatorSubtractionTest implements VariableValues {
    @Test
    void SubtractionOfPositiveIntegers() {
        assertEquals(POSITIVE_INTEGER1 - POSITIVE_INTEGER2,
                new Calculator(POSITIVE_INTEGER1, POSITIVE_INTEGER2).calculate('-'));
    }
    @Test
    void SubtractionOfNegativeIntegers() {
        assertEquals(NEGATIVE_INTEGER1 - NEGATIVE_INTEGER2,
                new Calculator(NEGATIVE_INTEGER1, NEGATIVE_INTEGER2).calculate('-'));
    }
    @Test
    void SubtractionOfPositiveAndNegativeIntegers() {
        assertEquals(POSITIVE_INTEGER1 - NEGATIVE_INTEGER2,
                new Calculator(POSITIVE_INTEGER1, NEGATIVE_INTEGER2).calculate('-'));;
    }
    @Test
    void SubtractionOfPositiveFloats() {
        assertEquals(POSITIVE_FLOAT1 - POSITIVE_FLOAT2,
                new Calculator((int)POSITIVE_FLOAT1, (int)POSITIVE_FLOAT2).calculate('-'));;
    }
    @Test
    void SubtractionOfNegativeFloats() {
        assertEquals(NEGATIVE_FLOAT1 - NEGATIVE_FLOAT2,
                new Calculator((int)NEGATIVE_FLOAT1, (int)NEGATIVE_FLOAT2).calculate('-'));
    }
    @Test
    void SubtractionOfPositiveAndNegativeFloats() {
        assertEquals(POSITIVE_FLOAT1 - NEGATIVE_FLOAT2,
                new Calculator((int)POSITIVE_FLOAT1, (int)NEGATIVE_FLOAT2).calculate('-'));
    }
    @Test
    void SubtractionOfPositiveIntegerAndNegativeDouble() {
        assertEquals(POSITIVE_INTEGER1 - NEGATIVE_FLOAT2,
                new Calculator(POSITIVE_INTEGER1, (int)NEGATIVE_FLOAT2).calculate('-'));
    }
}
