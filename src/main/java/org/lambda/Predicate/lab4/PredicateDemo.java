package org.lambda.Predicate.lab4;

import java.util.function.Predicate;

public class PredicateDemo {

    static boolean isPersonEligibleForVoting(Persons persons, Predicate<Persons> predicate) {
        return predicate.test(persons);
    }


    public static void main(String args[]) {
        Persons persons = new Persons("Alex", 23);
        // Created a predicate. It returns true if age is greater than 18.
        Predicate<Persons> predicate = p -> p.age > 18;

        boolean eligible = isPersonEligibleForVoting(persons, predicate);

        System.out.println("Person is eligible for voting: " + eligible);
    }
}

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}