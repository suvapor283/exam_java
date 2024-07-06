package com.exam.exam10;

public class ArrayExam01 {

	public static void main(String[] args) {
		
		// 5개의 공간을 가지는 배열 선언
		int[] inArray = new int[5];
		// 문자열 5개 저장 배열
		String[] strArray = new String[5];
		
		// 값과 공간을 가지는 배열
		int[] varArray = {1, 2, 3, 4, 5};
		
		// 배열 자체를 출력
		System.out.println(inArray);
		
		// 배열 첫번 째 값 출력
		// 값을 담지 않으면 초기값으로 기본값으로 들어간다.
		System.out.println(inArray[0]);
		System.out.println(inArray[2]);
		
		System.out.println(varArray[2]);
		
		// 배열에 값 담기
		inArray[0] = 10;
		inArray[1] = 12;
		inArray[2] = 32;

		System.out.println(inArray[0]);
		System.out.println(inArray[2]);
	}
}