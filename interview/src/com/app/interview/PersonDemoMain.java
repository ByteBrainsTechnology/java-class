package com.app.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonDemoMain {

	public static void main(String[] args) {
		List<Person> people = new ArrayList<>();
		people.add(new Person("Alice", 25));
		people.add(new Person("Bob", 20));
		people.add(new Person("Charlie", 30));
		Collections.sort(people);
		System.out.println(people);
	}
}
