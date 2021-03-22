package com.company;

public class Main {

    final static long FACTOR_A = 16807;
    final static long FACTOR_B = 48271;

    public static void main(String[] args) {
        if (args.length == 2) {
            long initialNumberA = Long.parseLong(args[0]);
            long initialNumberB = Long.parseLong(args[1]);
            Generator generatorA = new Generator(FACTOR_A);
            Generator generatorB = new Generator(FACTOR_B);
            MatchesCounter compareAndGenerate = new MatchesCounter(generatorA, generatorB);
            System.out.println(compareAndGenerate.countMatches(initialNumberA, initialNumberB));
            } else {
            System.out.println("Please provide 2 integer parameters to the application");
        }
    }
}
