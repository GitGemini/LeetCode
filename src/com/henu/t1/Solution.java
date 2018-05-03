package com.henu.t1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/*
 * 给定一个整数数组，找出其中两个数满足相加等于你指定的目标数字。 
 *　要求：这个函数twoSum必须要返回能够相加等于目标数字的两个数的索引，
 *  	且index1必须要小于index2。
 * 	请注意一点，你返回的结果（包括index1和index2）都不是基于0开始的。
 * 	你可以假设每一个输入肯定只有一个结果。 
 */
public class Solution {

	public static void main(String[] args) {
		int[] nums = createSolution(1000);
		
		int[] res = twoSum1(nums, 600);
		
		System.out.println(res[0] + " " + res[1]);
	}
	
	private static int[] createSolution(int len) {  
        int solutionArr[] = new int[len];  
        int ranIndex=0;  
        Random random = new Random();  
        for (int i = 0; i < len; i++)  
            solutionArr[i] = i + 1;  
        for (int i = 0; i <len; i++) {  
            ranIndex = random.nextInt(len);  
            swap(solutionArr, ranIndex, i);  
        }  
        return solutionArr;  
    }  

	private static void swap(int[] arr, int ranIndex, int i) {
		int temp = arr[i];
		arr[i] = arr[ranIndex];
		arr[ranIndex] = temp;
	}

	/*
	 * 暴力解法：双重循环 时间复杂度O(n^2)
	 */
	public static int[] twoSum2(int[] nums, int target) {
		int[] result = new int[2];

		//
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(target - nums[i])) {
				result[0] = i + 1;
				result[1] = map.get(target - nums[i]);
				break;
			}
			map.put(nums[i], i + 1);
		}
		return result;
	}

	/*
	 * 暴力解法：双重循环 时间复杂度O(n^2)
	 */
	public static int[] twoSum1(int[] nums, int target) {
		int i, j;
		int[] result = new int[2];
		outer: for (i = 0; i < nums.length; i++) {
			for (j = i + 1; j < nums.length; j++) {
				if (target == nums[i] + nums[j]) {
					result[0] = i + 1;
					result[1] = j + 1;
					break outer;
				}
			}
		}
		return result;
	}
}
