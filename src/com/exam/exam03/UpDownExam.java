package com.exam.exam03;

public class UpDownExam {

	public static void main(String[] args) {
		
		int num = 10;
		int sum = 0;
		
		// 연산 후에 증가
		sum = num++;
		
		System.out.println("sum = " + sum + ", num = " + num);
		
		// 연산 전에 증가
		sum = ++num;
		
		System.out.println("sum = " + sum + ", num = " + num);
	}
}