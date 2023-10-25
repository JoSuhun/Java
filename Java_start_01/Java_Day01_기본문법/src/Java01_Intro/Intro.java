package Java01_Intro;

public class Intro {
	public static void main(String[] args) {
		System.out.println("hihihi");
		
		/*
		 주석이에옹 주석주석
		 */
		System.out.print("fff");
		System.out.println("wewe");
		System.out.println("\\");
		System.out.println("\"dd");
		System.out.printf("%d \n", 10); // 10진수
		System.out.printf("%o \n", 10); // 8진수
		System.out.printf("%X \n", 10); // 16진수
		System.out.printf("%x \n", 10); // 16진수
		
		System.out.printf("%4d\n", 10); // 4칸 확보하고 오른쪽부터 차지
		System.out.printf("%-4d\n", 10); // 4칸 확보하고 왼쪽부터 차지
		System.out.printf("%04d\n", 10); // 4칸 확보하고 오른쪽부터 차지(빈칸 0)
		
		System.out.printf("%f\n", 10.1); // 실수
		System.out.printf("%.2f\n", 10.1056); // 실수 (소수점 둘째자리까지)
		
		System.out.printf("%s\n", "조수훈");
		System.out.printf("%c\n", 'o');
		
	}
}
