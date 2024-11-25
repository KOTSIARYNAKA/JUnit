package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTests {
    Calculator calculator = new Calculator();

    public void shouldReturnPositiveResult_when_sumTwoNumbers() {
        Double result = calculator.add(22.0, 23.0);
        assertEquals(result, 45);
    }
        @Test
        public void testSubtract() {
            assertEquals(1.0, calculator.subtract(3.0, 2.0));
        }

        @Test
        public void testMultiply() {
            assertEquals(6.0, calculator.multiply(2.0, 3.0));
        }

        @Test
        public void testDivide() {
            assertEquals(2.0, calculator.divide(6.0, 3.0));
        }
        @Test
        public void testDivideByZero() {
            Exception exception = assertThrows(ArithmeticException.class, () -> {
                calculator.divide(1.0, 0);
            });

            assertEquals("Деление на ноль невозможно.", exception.getMessage());
        }

    }

