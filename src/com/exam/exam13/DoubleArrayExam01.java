package com.exam.exam13;

public class DoubleArrayExam01 {

	public static void main(String[] args) {
		
		//2차배열 선언
		int[][] arr = new int[3][5];
		int[][] arr01 = new int [3][];
		int[][] arr02 = {{1,2,3}, {4,5,6}};
		
		System.out.println("2차배열" + arr);
		System.out.println("2차배열 1차수 출력 : " + arr[1]);
		System.out.println("2차배열 1차수 출력 : " + arr[2]);
		System.out.println("2차배열 2차수 출력 : " + arr02[1][1]);
		
		// 열을 쓰지 않고 선언했다면 추가해주어야 한다.
		for (int i = 0; i < arr01.length; i++) {
			arr01[i] = new int[3];
		}
	}
}