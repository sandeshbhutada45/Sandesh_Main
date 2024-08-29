package Questions;

import java.util.Arrays;

public class Kth_Elelment {

	public static void main(String[] args) {

		int nums[] = {3,2,1,5,6,4};
		int k = 2;

		int temp = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] < nums[j]) {
					temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}

			}
		}
		System.out.println(Arrays.toString(nums));
		int KthLargest= nums[k-1];
		System.out.println(KthLargest);
	}
}
