package com.example.individualprep.service;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class VectorUtilityTest {

    @Test
    void multiplyScalesEachComponent() {
        VectorUtility vectorUtility = new VectorUtility();

        double[] result = vectorUtility.multiply(new double[] { 1.5, -2.0, 0.25 }, -3);

        assertArrayEquals(new double[] { -4.5, 6.0, -0.75 }, result, 1e-9);
    }
}
