package test02_inheritance;

public class Student extends Person {
	String major;
	
	public void eat() {
		System.out.println("음식을 먹는다.");
	}
	
	public void study() {
		System.out.println("공부를 한다.");
	}
}