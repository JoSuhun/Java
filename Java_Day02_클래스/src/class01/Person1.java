package class01;

public class Person1 {
	public static void main(String[] args) {
		//Person�̶�� Ŭ������ ������ ��.
		Person p = new Person(); // �ν��Ͻ� ����
		p.age = 70;
		p.hobby = "��ȭ����";
		p.name = "Jo";
		
		p.info();
		
		Person p2 = new Person();
		p2.study(10);

	}
}
