package Java01_Intro;

import java.util.Scanner;

public class ���ⱸ�ϱ� {
	public static void main(String[] args) {
		System.out.println("�⵵�� �Է��ϻ�");
		System.out.print("> ");
		
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		if ((year % 4 == 0 && year % 100 != 0)||year % 400 == 0) {
			System.out.printf("%d ���� �����Դϴ�\n", year);
		} else {
			System.out.printf("%d���� ����Դϴ�\n", year);
		}
	}
}
