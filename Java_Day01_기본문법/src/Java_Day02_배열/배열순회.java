package Java_Day02_�迭;

import java.util.Arrays;

public class �迭��ȸ {
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
		 for-each �������� ���� for��!!
		 for(�ڷ��� ������: �ݺ��� �� �ִ� ��){
		}
		*/
		for(int n: nums) {
			System.out.println(n);
		}
		
		// �迭 ���빰���� ����� ��
		System.out.println(Arrays.toString(nums)); // [90, 12, 68, 6, 14, 246]
	}
}
