package com.company;

public class Main {

    public static void main(String[] args) {
        if (args.length == 2) {
            long initialNumberA = Integer.parseInt(args[0]);
            long initialNumberB = Integer.parseInt(args[1]);
            Generator generator = new Generator();
            System.out.println(generator.countMatches(initialNumberA, initialNumberB));
            } else {
            System.out.println("Please provide 2 integer parameters to the application");
        }
    }
}
