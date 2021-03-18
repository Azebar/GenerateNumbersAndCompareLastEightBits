package com.company;

public class Generator {
    final int factorA = 16807;
    final int factorB = 48271;
    final int dividedBy = 2147483647;
    static int counter = 0;

    public long generateNumber(long number, long factor) {
        return Long.remainderUnsigned((number*factor),dividedBy);
    }

    public void compareLastEightBits(long num1, long num2) {
        if (num1 % 256 == num2 % 256)
            counter++;
    }

    public void countMatches(long num1, long num2) {
        long generatedNumber1 = generateNumber(num1, factorA);
        long generatedNumber2 = generateNumber(num2, factorB);
        compareLastEightBits(generatedNumber1, generatedNumber2);
        for (int i = 0; i < 999999; i++) {
            generatedNumber1 = generateNumber(generatedNumber1, factorA);
            generatedNumber2 = generateNumber(generatedNumber2, factorB);
            compareLastEightBits(generatedNumber1, generatedNumber2);
        }
        System.out.println(counter);
    }
}
