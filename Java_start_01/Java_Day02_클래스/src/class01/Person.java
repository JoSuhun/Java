package class01;

public class Person {
	static int personCount; // Ŭ���� ����
	String name; // �ν��Ͻ� ����
	int age;
	String hobby;
	
	public void info() {
		System.out.println("�� �̸��� "+name+"�Դϴ�.");
		System.out.println("���̴� "+age+"��, ��̴� "+hobby+"�Դϴ�.");
	}
	public void study(int time) {
		System.out.println(time+"�ð� �����߻�");
	}
}
