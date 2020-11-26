package com.java8;

import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Comparator<Person> cmpAge = (p1,p2) -> p2.getAge() - p1.getAge();
        Comparator<Person> cmpFirstName = (p1,p2) -> p1.getFirstName().compareTo(p2.getFirstName());
        Comparator<Person> cmpLastName = (p1,p2) -> p1.getLastName().compareTo(p2.getLastName());

        Function<Person, Comparable> f1 = p -> p.getAge();
        Function<Person, Comparable> f2 = p -> p.getFirstName();
        Function<Person, Comparable> f3 = p -> p.getLastName();

        Comparator<Person> cpmPerson = Comparator.comparing(f1);
        Comparator<Person> cpmPerson1 = Comparator.comparing(p -> p.getAge());
        Comparator<Person> cpmPerson2 = Comparator.comparing(Person::getAge);

        Comparator<Person> cpmPersonByF2 = Comparator.comparing(f2);

    }
}
