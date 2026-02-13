package com.example.individualprep.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArithmeticUtilityTest {

    private final ArithmeticUtility arithmetic = new ArithmeticUtility();

    @Test
    void addReturnsSumOfTwoPositives() {
        assertEquals(5.0, arithmetic.add(2.0, 3.0));
    }

    @Test
    void addReturnsSumWithNegatives() {
        assertEquals(-1.0, arithmetic.add(2.0, -3.0));
    }

    @Test
    void addReturnsSumWithZero() {
        assertEquals(7.0, arithmetic.add(7.0, 0.0));
    }

    @Test
    void addReturnsSumOfTwoNegatives() {
        assertEquals(-5.0, arithmetic.add(-2.0, -3.0));
    }

    @Test
    void multiplyReturnsProduct() {
        double result = arithmetic.multiply(6.5, -4);

        assertEquals(-26.0, result, 1e-9);
    }

    @Test
    void subtractReturnsValid(){
        ArithmeticUtility arithmeticUtility = new ArithmeticUtility();

        double result = arithmeticUtility.subtract(6.5,5);

        assertEquals(1.5,result,1e-9);
    }


}
