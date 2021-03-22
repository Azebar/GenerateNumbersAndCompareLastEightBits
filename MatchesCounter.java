package com.company;

public class MatchesCounter implements Comparable {

    Generator generatorA;
    Generator generatorB;

    public MatchesCounter(Generator generatorA, Generator generatorB) {
        this.generatorA = generatorA;
        this.generatorB = generatorB;
    }

    @Override
    public  boolean compareLastEightBits(long num1, long num2) {
        return  num1 % 256 == num2 % 256;
    }

    public int countMatches(long num1, long num2) {
        int counter = 0;
        long generatedNumber1 = generatorA.generateNumber(num1);
        long generatedNumber2 = generatorB.generateNumber(num2);
        if (compareLastEightBits(generatedNumber1, generatedNumber2))
            counter++;
        for (int i = 0; i < 999999; i++) {
            generatedNumber1 = generatorA.generateNumber(generatedNumber1);
            generatedNumber2 = generatorB.generateNumber(generatedNumber2);
            if (compareLastEightBits(generatedNumber1, generatedNumber2))
                counter++;
        }
        return counter;
    }
}
