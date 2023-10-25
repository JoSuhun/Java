package class01;

public class Person {
	static int personCount; // 클래스 변수
	String name; // 인스턴스 변수
	int age;
	String hobby;
	
	public void info() {
		System.out.println("내 이름은 "+name+"입니다.");
		System.out.println("나이는 "+age+"세, 취미는 "+hobby+"입니다.");
	}
	public void study(int time) {
		System.out.println(time+"시간 공부했삼");
	}
}
