package Java_Day02_�迭;

public class array {
	public static void main(String[] args) {
		// 1���� �迭 �����ϱ�
		int[] score1;	// �� ��� ����
		int score2[];
		
		// �迭 ���� �� �ʱ�ȭ
		// 1. �ڷ���[] �̸� = new �ڷ���[����]
		int[] score3 = new int[5];

		// 2. �ڷ���[] �̸� = new �ڷ���[]{1,2,3,4}
		int[] score4 = new int[] { 1, 2, 3, 4 };
		
		// 3. �ڷ���[] �̸� = {1,2,3,4}; ����� ���ÿ� �ʱ�ȭ
		int[] score5 = { 1, 2, 3, 4 };
		
		for (int i = 0; i < score5.length; i++) {
			System.out.println(score5[i]);	
		}
		// 3���� ���, ������� ����
		score3 = new int[6];
		score3 = new int[] {1,2,3,4,5};
//		score3 = {1,2,3}; �̰� �ȵ�
		
		
		int[] score6 = new int[5];
		score6[0] = 10;
		score6[1] = 20;
//		score6[5] = 60;
		for (int i = 0; i < score6.length; i++) {
			System.out.println(score6[i]);
		}
		
	}
}
