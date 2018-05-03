package com.henu.floor;

/*
 *动态规划
 *有10级楼梯，每次上1步或2步 问有几种走法
 *
 *方法二 3：针对上一种的缺点，不需要保存所有状态的值
 *由底向上计算，只需要计算前两个子状态的值
 */
public class T4 {
	private static final int stair = 10;// 台阶数
	private static int sum = 0;// 步数

	public static void main(String[] args) {
		sum = compute(stair);
		System.out.println("共有 " + sum + " 种走法。");
	}

	private static int compute(int n) {
		if (n <= 0) {
			return 0;
		}

		if (1 == n) {
			return 1;
		}

		if (2 == n) {
			return 2;
		}
		int a = 1, b = 2;
		int temp = 0;
		for (int i = 2; i < n; i++) {
			temp = a + b;
			a = b;
			b = temp;
		}
		return temp;
	}
}
