package test03_super;

public class Person {
	String name;
	int age;
	
	public Person() {
		System.out.println("Person�� �⺻������ �Դϴ�.");
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person(String name) {
		super();
		this.name = name;
	}

	public void eat() {
		System.out.println("������ �Դ´�.");
	}
}
