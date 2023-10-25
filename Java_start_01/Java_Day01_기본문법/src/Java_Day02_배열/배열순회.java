package Java_Day02_배열;

import java.util.Arrays;

public class 배열순회 {
	public static void main(String[] args) {
		
		int[] nums = {45, 6, 34, 3,7,123};
		
		for(int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] *= 2;
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		
		/*
		 for-each 가독성이 향상된 for문!!
		 for(자료형 변수명: 반복할 수 있는 것){
		}
		*/
		for(int n: nums) {
			System.out.println(n);
		}
		
		// 배열 내용물만을 출력할 때
		System.out.println(Arrays.toString(nums)); // [90, 12, 68, 6, 14, 246]
	}
}
