package com.exam.exam08;

import java.util.Scanner;

public class WhileTest02 {

	public static void main(String[] args) {
		
		int target = (int)(Math.random() * 50) + 1;
		Scanner scan = new Scanner(System.in);
		
		int user = 0;
		int count = 1;
		
		while (target != user) {
			
			System.out.print("숫자를 입력 : ");
			user = scan.nextInt();
			
			if (target > user) {
				System.out.println("업 !");
			}
			else if (target < user) {
				System.out.println("다운 !");
			}
			else {
				System.out.println(target + "은 정답 !");
				System.out.println(count + "번만에 맞추셨습니다 !");
			}
			count++;
		}
		scan.close();
	}
}
