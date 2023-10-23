package Java_Day02_배열;

public class array {
	public static void main(String[] args) {
		// 1차원 배열 선언하기
		int[] score1;	// 이 방법 권장
		int score2[];
		
		// 배열 생성 및 초기화
		// 1. 자료형[] 이름 = new 자료형[길이]
		int[] score3 = new int[5];

		// 2. 자료형[] 이름 = new 자료형[]{1,2,3,4}
		int[] score4 = new int[] { 1, 2, 3, 4 };
		
		// 3. 자료형[] 이름 = {1,2,3,4}; 선언과 동시에 초기화
		int[] score5 = { 1, 2, 3, 4 };
		
		for (int i = 0; i < score5.length; i++) {
			System.out.println(score5[i]);	
		}
		// 3번의 경우, 제약사항 존재
		score3 = new int[6];
		score3 = new int[] {1,2,3,4,5};
//		score3 = {1,2,3}; 이거 안됨
		
		
		int[] score6 = new int[5];
		score6[0] = 10;
		score6[1] = 20;
//		score6[5] = 60;
		for (int i = 0; i < score6.length; i++) {
			System.out.println(score6[i]);
		}
		
	}
}
