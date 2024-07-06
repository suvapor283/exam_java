package com.exam.exam10;

public class ArrayExam02 {

	public static void main(String[] args) {
		
		int[] arr = new int[10];
		
		// 배열에 값을 부여
		for (int i = 0; i < 10; i++) {
			arr[i] = (int)(Math.random() * 100) + 1;
		}
		int sum = 0;
		// length는 변수가 아닌 속성이다.
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + "\t");
			sum += arr[i];
		}
		System.out.println("\n합 : " + sum);
	}
}
