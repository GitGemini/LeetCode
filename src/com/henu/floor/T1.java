package com.henu.floor;

/*
 *动态规划
 *有10级楼梯，每次上1步或2步 问有几种走法
 *
 *方法一：递归 每次选择走一步或者两步
 *效率较低 指数级的时间复杂度
 */
public class T1 {
	private static final int stair = 10;// 台阶数
	private static int len = 0, sum = 0;// 步数
	// 走法，最多走 n 步
	private static int[] steps = new int[stair];

	public static void main(String[] args) {
		compute(stair);
		System.out.println("共有 " + sum + " 种走法。");
	}

	private static void compute(int count) {
		if (count < 0) {
			return;
		}

		// 剩余0步时表示走完了
		if (0 == count) {
			print();
			sum++;
			return;
		}

		// 每次走一步或者两步
		for (int i = 1; i <= 2; i++) {
			steps[len] = i;
			len++;

			compute(count - i);
			len--;
		}
	}

	private static void print() {
		System.out.print("走法：");
		for (int i = 0; i < len; i++) {
			System.out.print(steps[i]+" ");
		}
		System.out.println("结束");
	}
}
