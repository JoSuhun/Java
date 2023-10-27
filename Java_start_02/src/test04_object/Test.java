package test03_super;

public class Test {
	public static void main(String[] args) {
		Student st = new Student("조수훈", 89, "아무 전공");
		System.out.println(st.name);
//		st.study();
		st.eat();
	}

}
