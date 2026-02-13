package com.example.individualprep.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ArithmeticUtilityTest {

    @Test
    void multiplyReturnsProduct() {
        ArithmeticUtility arithmeticUtility = new ArithmeticUtility();

        double result = arithmeticUtility.multiply(6.5, -4);

        assertEquals(-26.0, result, 1e-9);
    }

    @Test
    void subtractReturnsValid(){
        ArithmeticUtility arithmeticUtility = new ArithmeticUtility();

        double result = arithmeticUtility.subtract(6.5,5);

        assertEquals(1.5,result,1e-9);
    }


}
