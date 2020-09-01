package edu.harvard.jamesfulford;

public class Main {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Unsufficient arguments! Please provide your name as a command-line argument.");
            System.exit(1);
        }

        for (String name : args) {
            System.out.println(String.format("Hello %s", name));
        }
    }
}
