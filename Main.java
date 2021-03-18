package com.company;

public class Main {

    public static void main(String[] args) {
        if (args.length == 2) {
            int initialNumberA = Integer.parseInt(args[0]);
            int initialNumberB = Integer.parseInt(args[1]);
            Generator generator = new Generator();
            generator.countMatches(initialNumberA, initialNumberB);
            } else {
            System.out.println("Please provide 2 integer parameters to the application");
        }

    }
}
