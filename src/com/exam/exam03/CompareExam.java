package com.exam.exam03;

public class CompareExam {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 15;
		int c = 12;
		
		System.out.println(a >= b);	// a가 b보다 크거나 같다.
		System.out.println(a < b);	// a가 b보다 작다.
		System.out.println(c == b);	// c와 b가 같다.
		System.out.println(a != b);	// a와 b가 같지 않다.
		
		// 논리연산 &&(and) ||(or)
		System.out.println((a < b) && (b > c));	// a가 b보다 작고, b는 c보다 크다.
		System.out.println((a > b) && (b > c));	// a가 b보다 크고, b는 c보다 크다.
		System.out.println((a > b) || (b > c));	// a가 b보다 크거나, b가 c보다 작다.
	}
}