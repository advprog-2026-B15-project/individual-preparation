package com.example.individualprep.service;

import org.springframework.stereotype.Service;

@Service
public class ArithmeticUtility {
    
    public double add(double o1, double o2) {
        return o1 + o2;
    }

    public double subtract(double o1, double o2) {
        return o1-o2;
    }

    public double multiply(double o1, double o2) {
        return o1*o2;
    }

    public double divide(double o1, double o2) {
        if (o2 == 0.0) throw new ArithmeticException("Cannot divide by zero!");
        return o1 / o2;
    }

    public double exponent(double base, int n) {
        if (n == 0) return 1.0;

        // Handle negative exponents: x^-n = (1/x)^n
        if (n < 0) {
            base = 1.0 / base;
            n = -n;
        }

        double result = 1.0;
        while (n > 0) {
            // If n is odd, multiply result by current base
            if (n % 2 != 0) {
                result *= base;
            }
            // Square the base and halve the exponent
            base *= base;
            n /= 2;
        }

        return result;
    }
}
