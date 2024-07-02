package com.exam.exam03;

public class OperatorExam {

	public static void main(String[] args) {
		
		int num01 = 100;
		byte byNum01 = 10;
		long lyNum01 = 20;
		double dyNum01 = 33.3333;
		
		// byte 끼리 더해도 결과는 int
		// 사칙연산 대상들의 datatype이 int이하일 경우 결과의 datetype은 무조건 int
//		byte byResult = byNum01 + byNum01;
		
		int intResult01 = byNum01 + byNum01;
		
		// 사칙연산시 int 이상인 대상이 있을 경우 대상들 중 제일 큰 datatype이 결과의 datatype이 된다.
//		intResult01 = lyNum01 + num01;
		
		intResult01 = byNum01 + num01;
		
		int target = 10;
		System.out.println(target % 3);
	}
}