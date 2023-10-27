package test03_super;

public class Student extends Person {
	String major;
	
	public Student() {
//		super(); --> �θ��� �⺻������ ȣ��
		this("��������");
		System.out.println("Student�� �⺻������ �Դϴ�.");
	}
	
	public Student(String major) {
		this.major = major;
	}
	
	public Student(String name, int age, String major) {
		super(name, age);
		this.major = major;
	}
	
	public void study() {
		super.eat();
		System.out.println("지식을 먹는다.");
	}
	
	public void eat() {
		super.eat();
		System.out.println("������ �Դ´�.");
	}
}