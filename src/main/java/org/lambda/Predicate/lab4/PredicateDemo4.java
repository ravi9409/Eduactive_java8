package org.lambda.Predicate.lab4;

import java.util.function.Predicate;

public class PredicateDemo4 {

    public static void main(String[] args) {
        Predicate<String> predicate  = Predicate.isEqual("Hello");

        // The same thing can be achieved by below lambda.
        // Predicate<String> predicate  = p -> p.equals("Hello");

        System.out.println(predicate.test("Welcome"));
    }
}