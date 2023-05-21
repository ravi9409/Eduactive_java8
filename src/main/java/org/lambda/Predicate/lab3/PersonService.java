package org.lambda.Predicate.lab3;

import java.util.Collections;
import java.util.List;

public class PersonService {

    public static List<Person> getPersons(List<Person> persons){
        // Created an anonymous Comparator, which sorts the Person
        // object on the basis of Person name.
        Collections.sort(persons, ( p1,p2) -> {
                return p1.getName().compareTo(p2.getName());
            });
        return persons;
    }
}
