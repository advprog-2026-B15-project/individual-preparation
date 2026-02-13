package com.example.individualprep.service;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class VectorUtilityTest {

    @Test
    void multiplyScalesEachComponent() {
        VectorUtility vectorUtility = new VectorUtility();

        double[] result = vectorUtility.multiply(new double[] { 1.5, -2.0, 0.25 }, -3);

        assertArrayEquals(new double[] { -4.5, 6.0, -0.75 }, result, 1e-9);
    }

    @Test
    void dotProductReturnsValid(){
        VectorUtility vectorUtility = new VectorUtility();

        double[] v1_test = {1,2.5,3};
        double[] v2_test = {1,2.5,3};

        double result = vectorUtility.dotProduct(v1_test,v2_test);
        assertEquals(16.25, result,1e-9);
    }

    @Test
    void dotProductThrowsNull() {
        VectorUtility vectorUtility = new VectorUtility();

        assertThrows(IllegalArgumentException.class,
                () -> vectorUtility.dotProduct(null, new double[]{1, 2})
        );

        assertThrows(IllegalArgumentException.class,
                () -> vectorUtility.dotProduct(new double[]{1, 2}, null)
        );
    }

    @Test
    void dotProductThrowsDifferentLengths() {
        VectorUtility vectorUtility = new VectorUtility();

        assertThrows(IllegalArgumentException.class,
                () -> vectorUtility.dotProduct(
                        new double[]{1, 2},
                        new double[]{1, 2, 3}
                )
        );
    }
}
