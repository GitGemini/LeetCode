package com.henu.floor;

/*
 *动态规划
 *有10级楼梯，每次上1步或2步 问有几种走法
 *
 *方法二 1：递归 
 *效率还是低 指数级的时间复杂度
 *主要是在递归调用时有大量重复计算
 */
public class T2 {
	private static final int stair = 10;// 台阶数
	private static int sum = 0;// 步数

	public static void main(String[] args) {
		sum = compute(stair);
		System.out.println("共有 " + sum + " 种走法。");
	}

	private static int compute(int count) {
		if (count <= 0) {
			return 0;
		}
		
		if (1 == count) {
			return 1;
		}
		
		if (2 == count) {
			return 2;
		}
		return compute(count-1)+compute(count-2);
	}	
}

