package com.exam.exam07;

public class ExTriangle {

	public static void main(String[] args) {
		
		// 공백이 있는 직각삼각형 만들기
		for (int i = 0; i < 7; i++) {
			
			// 공백 - 감소
			for (int j = 0; j < 7-i; j++) {
				
				System.out.print(" ");
			}
			// 별 - 증가
			for (int s = 0; s < i+1; s++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
