package com.exam.exam04;

public class IfTest01 {

	public static void main(String[] args) {
		
		int score = 80;
		
		if (score >= 60) {	// 참일때 실행
			System.out.println("합격");
		}
		else {				// 참이 아닐 때 실행
			System.out.println("불합격");
		}
	}
}