package org.lambda.Predicate.lab4;

import java.util.function.Predicate;

public class PredicateDemo1 {

    static boolean isPersonEligibleForMembership(Persons persons, Predicate<Persons> predicate){
        return predicate.test(persons);
    }


    public static void main (String args[]){
        Persons persons = new Persons("Alex", 23);

        // Created a predicate. It returns true if age is greater than 18.
        Predicate<Persons> greaterThanEighteen = (p) -> p.age > 18;
        // Created a predicate. It returns true if age is less than 60.
        Predicate<Persons> lessThanSixty = (p) -> p.age < 60;

        Predicate<Persons> predicate = greaterThanEighteen.and(lessThanSixty);

        boolean eligible = isPersonEligibleForMembership(persons, predicate);
        System.out.println("Person is eligible for membership: " + eligible);
    }
}
