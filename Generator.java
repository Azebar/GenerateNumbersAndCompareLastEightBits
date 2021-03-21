package com.company;

public class Generator {
    final static long FACTOR_A = 16807;
    final static long FACTOR_B = 48271;
    final static long DIVIDED_BY = 2147483647;

    public long generateNumber(long number, long factor) {
        return (number * factor) % DIVIDED_BY;
    }

    public boolean compareLastEightBits(long num1, long num2) {
        return  num1 % 256 == num2 % 256;
    }

    public int countMatches(long num1, long num2) {
        int counter = 0;
        long generatedNumber1 = generateNumber(num1, FACTOR_A);
        long generatedNumber2 = generateNumber(num2, FACTOR_B);
        if (compareLastEightBits(generatedNumber1, generatedNumber2))
            counter++;
        for (int i = 0; i < 999999; i++) {
            generatedNumber1 = generateNumber(generatedNumber1, FACTOR_A);
            generatedNumber2 = generateNumber(generatedNumber2, FACTOR_B);
            if (compareLastEightBits(generatedNumber1, generatedNumber2))
                counter++;
        }
        return counter;
    }
}
