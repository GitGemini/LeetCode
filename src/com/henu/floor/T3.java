package com.henu.floor;

import java.util.HashMap;
import java.util.Map;

/*
 *动态规划
 *有10级楼梯，每次上1步或2步 问有几种走法
 *
 *方法二 2：针对上一种的缺点，暂存已经计算过的值
 *称为备忘录算法 添加一个map做缓存
 *缺点 空间复杂度 为 O(n)
 */
public class T3 {
	private static final int stair = 10;// 台阶数
	private static int sum = 0;// 步数

	private static Map<Integer, Integer> map = new HashMap<Integer, Integer>();
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
		if(map.containsKey(n)){
			return map.get(n);
		}else{
			int value = compute(n-1)+compute(n-2);
			map.put(n, value);
			return value;
		}
	}	
}


