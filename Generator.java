package com.company;

public class Generator implements Generatable{

    final long FACTOR;

    public Generator(long FACTOR) {
        this.FACTOR = FACTOR;
    }

    @Override
    public long generateNumber(long number) {
        return (number * FACTOR) % Integer.MAX_VALUE;
    }
}
