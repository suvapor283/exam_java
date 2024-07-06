package com.exam.exam11;

public class DeepCopyOfArrayExam01 {

	public static void main(String[] args) {
		
		int[] arr1 = {1, 3, 5, 7, 9};
		int[] arr2 = new int[5];
		
		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		
		arr2[1] = 11;
		arr2[0] = 8;
		
		System.out.println();
		System.out.print("arr2 값 출력 : ");
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + "\t");
		}
		System.out.println();
		System.out.print("arr1 값 출력 : ");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + "\t");
		}
	}
}