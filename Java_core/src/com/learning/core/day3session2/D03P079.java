package com.learning.core.day3session2;

import java.util.TreeSet;

public class D03P079 {
	public static void main(String[] args) {
        TreeSet<Person> personSet = new TreeSet<>();

        personSet.add(new Person(1, "Jerry", 30, 999.0));
        personSet.add(new Person(2, "Smith", 35, 2999.0));
        personSet.add(new Person(3, "Popeye", 40, 5999.0));
        personSet.add(new Person(4, "Jones", 22, 6999.0));
        personSet.add(new Person(5, "John", 50, 1999.0));
        personSet.add(new Person(6, "Tom", 55, 3999.0));

        for (Person person : personSet) {
            if (person.getName().startsWith("J")) {
                System.out.println(person);
                break; // Stop after finding the first person whose name starts with "J"
            }
        }
    }

}
