package Java_Day02_�迭;

import java.util.Arrays;

public class �迭���� {
	public static void main(String[] args) {
		
		int[] nums = {45, 6, 34, 3,7,123};
		
		
		// 1
		int[] tmp = new int[nums.length*2];
		for(int i=0; i<nums.length; i++) {
			tmp[i] = nums[i];
		}
		System.out.println(Arrays.toString(tmp));
		
		
		//2		Arrays.copyOf(�����迭, ����迭ũ��)
		int[] tmp2 = Arrays.copyOf(nums, nums.length*2);
		System.out.println(Arrays.toString(tmp2));
		
		
		//3		System.arraycopy(�����迭, �����迭������, ����迭, ����迭������, �����迭ũ��)
		int[] tmp3 = new int[nums.length*2];
		System.arraycopy(nums, 0, tmp3, 0, nums.length);
		System.out.println(Arrays.toString(tmp3));
		
	}
}
