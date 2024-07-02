package com.exam.exam04;

import java.util.Scanner;

public class IfTest02 {

	public static void main(String[] args) {
		
		// 키보드로부터 입력되는 값을 기다렸다가 들어오면 가져온다.
		Scanner scan = new Scanner(System.in); 
		
		System.out.println("나이 : ");
		int age = scan.nextInt();
		
		if (age > 19) {
			System.out.println("성인입니다.");
		}
		else {
			System.out.println("미성년자입니다.");
		}
		
		// 스캐너는 사용 후 닫아줘야 한다.
		scan.close();
	}
}