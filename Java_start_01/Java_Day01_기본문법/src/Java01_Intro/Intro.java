package Java01_Intro;

public class Intro {
	public static void main(String[] args) {
		System.out.println("hihihi");
		
		/*
		 �ּ��̿��� �ּ��ּ�
		 */
		System.out.print("fff");
		System.out.println("wewe");
		System.out.println("\\");
		System.out.println("\"dd");
		System.out.printf("%d \n", 10); // 10����
		System.out.printf("%o \n", 10); // 8����
		System.out.printf("%X \n", 10); // 16����
		System.out.printf("%x \n", 10); // 16����
		
		System.out.printf("%4d\n", 10); // 4ĭ Ȯ���ϰ� �����ʺ��� ����
		System.out.printf("%-4d\n", 10); // 4ĭ Ȯ���ϰ� ���ʺ��� ����
		System.out.printf("%04d\n", 10); // 4ĭ Ȯ���ϰ� �����ʺ��� ����(��ĭ 0)
		
		System.out.printf("%f\n", 10.1); // �Ǽ�
		System.out.printf("%.2f\n", 10.1056); // �Ǽ� (�Ҽ��� ��°�ڸ�����)
		
		System.out.printf("%s\n", "������");
		System.out.printf("%c\n", 'o');
		
	}
}
