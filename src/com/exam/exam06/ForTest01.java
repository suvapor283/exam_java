package com.exam.exam06;

public class ForTest01 {
	
	public static void main(String[] args) {
		
		int sum = 0;
		sum = sum + 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10;
		System.out.println(sum);
		
		// 반복문을 이용하여 덧셈
		sum = 0;
		
		for (int i = 1; i <= 10; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}
}
