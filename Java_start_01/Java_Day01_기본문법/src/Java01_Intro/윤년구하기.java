package Java01_Intro;

import java.util.Scanner;

public class 윤년구하기 {
	public static void main(String[] args) {
		System.out.println("년도를 입력하삼");
		System.out.print("> ");
		
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		if ((year % 4 == 0 && year % 100 != 0)||year % 400 == 0) {
			System.out.printf("%d 년은 윤년입니다\n", year);
		} else {
			System.out.printf("%d년은 평년입니다\n", year);
		}
	}
}
