package com.exam.exam08;

public class DoWhileTest01 {

	public static void main(String[] args) {

		int count = 1;
		
		while (count < 1) {
			System.out.println("while 실행");
		}
		
		do {
			System.out.println("do-while 실행");
		}while (count < 1);
	}
}
