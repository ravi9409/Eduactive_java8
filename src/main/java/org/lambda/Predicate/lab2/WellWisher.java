package org.lambda.Predicate.lab2;

public class WellWisher {

    public static void wish(Greeting greeting) {
        greeting.greet();
    }

    public static void main(String args[]) {
        wish(
                () -> {
                    System.out.println("Namaste");
                }
        );
    }
}
