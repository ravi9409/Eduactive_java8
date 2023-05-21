package org.lambda.Predicate.lab4;

import java.util.function.Predicate;

public class PredicateDemo2 {

    static boolean isPersonEligibleForRetirement(Persons persons, Predicate<Persons> predicate) {
        return predicate.test(persons);
    }


    public static void main(String args[]) {
        Persons persons = new Persons("Alex", 23);
        // Created a predicate. It returns true if age is greater than 60.
        Predicate<Persons> greaterThanSixty = (p) -> p.age > 60;
        // Created a predicate. It returns true if year of service is greater than 30.
        Predicate<Persons> serviceMoreThanThirty = (p) -> p.yearsOfService > 30;
        Predicate<Persons> predicate = greaterThanSixty.or(serviceMoreThanThirty);

        boolean eligible = isPersonEligibleForRetirement(persons, predicate);
        System.out.println("Person is eligible for membership: " + eligible);
    }
}

class Persons {
    String name;
    int age;
    int yearsOfService;

    Persons(String name, int age) {
        this.name = name;
        this.age = age;
        this.yearsOfService = yearsOfService;
    }
}
