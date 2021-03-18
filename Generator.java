package com.company;

public class Generator {
    final Integer factorA = 16807;
    final Integer factorB = 48271;
    final Integer dividedBy = 2147483647;
    static int counter = 0;

    public Integer generateNumber(Integer number, Integer factor) {
        return Integer.remainderUnsigned((number*factor),dividedBy);
    }

    public String getBitsValueInString(Integer number) {
        if (Integer.toBinaryString(number).length() > 8)
           return Integer.toBinaryString(number).substring(Integer.toBinaryString(number).length() - 8);
        else
           return Integer.toBinaryString(number);
    }

    public void compareLastEightBits(Integer num1, Integer num2) {
        if (getBitsValueInString(num1).compareTo(getBitsValueInString(num2)) == 0)
            counter++;
    }

    public void countMatches(Integer num1, Integer num2) {
        Integer generatedNumber1 = generateNumber(num1, factorA);
        Integer generatedNumber2 = generateNumber(num2, factorB);
        compareLastEightBits(generatedNumber1, generatedNumber2);
        for (int i = 0; i < 999999; i++) {
            generatedNumber1 = generateNumber(generatedNumber1, factorA);
            generatedNumber2 = generateNumber(generatedNumber2, factorB);
            compareLastEightBits(generatedNumber1, generatedNumber2);
        }
        System.out.println(counter);
    }
}
