package Java_Day02_�迭;

import java.util.Arrays;

public class �迭�ǽ� {
	public static void main(String[] args) {
		int[] nums = {45, 6, 34, 3, 7, 123};
		
		// �ִ밪 �ּҰ� ã��
		int min = Integer.MAX_VALUE;
		for (int i=0; i<nums.length; i++) {
			if (nums[i]<min) {
				min = nums[i];
			}
		}
		
		int max = Integer.MIN_VALUE;
		for (int i=0; i<nums.length; i++) {
			if (nums[i]>max) {
				max = nums[i];
			}
		}
		
		System.out.println(min);
		System.out.println(max);
		
		// �󵵼� ���ϱ�
		int[] intArray = {3, 7, 2, 5, 7, 7, 9, 2, 8, 1, 1, 5, 3};
		
		int maxValue = Integer.MIN_VALUE;
		for (int i=0; i<intArray.length; i++) {
			if (intArray[i] > maxValue) {
				maxValue = intArray[i];
			}
		}

		
		int[] idxArray = new int[maxValue+1];
		
		for (int i=0; i<intArray.length; i++) {
			idxArray[intArray[i]]++;
		}
		System.out.println(Arrays.toString(idxArray));
		// [0, 2, 2, 2, 0, 2, 0, 3, 1, 1]
		
	}
}
