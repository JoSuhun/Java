package class01;

public class Person1 {
	public static void main(String[] args) {
		//Person이라는 클래스를 정의해 둠.
		Person p = new Person(); // 인스턴스 생성
		p.age = 70;
		p.hobby = "만화보기";
		p.name = "Jo";
		
		p.info();
		
		Person p2 = new Person();
		p2.study(10);

	}
}
