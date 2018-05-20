package com.henu.test;

public class javaTest {

	public static void main(String[] args) {

		Person person = new Student("Tom", 15);
		person.work();
	}

}

class Person {

	protected final String name;
	protected final int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	protected void work() {
		System.out.println("Every person will work,for others or for self.");
	}

}

class Student extends Person {

	public Student(String name, int age) {
		super(name, age);
	}

	@Override
	protected void work() {
		learn();
	}

	private void learn() {
		System.out.println("I'm " + name + ", age " + age);

	}

}
