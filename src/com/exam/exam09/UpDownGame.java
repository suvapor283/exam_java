package com.exam.exam09;

import java.util.Scanner;

public class UpDownGame {

	public static void main(String[] args) {
		
		int target = (int)(Math.random() * 50) + 1;
		Scanner scan = new Scanner(System.in);
		
		int count = 1;
		int user = 0;
		for (;;) {
			System.out.print("숫자를 입력 : ");
			user = scan.nextInt();
			
			if (target == user) {
				System.out.println(user + "! 정답" + count + "번만에 맞추셨습니다.");
				break;
			}
			else if (target > user) {
				System.out.println("업 !");
			}
			else if (target < user) {
				System.out.println("다운 !");
			}
			count++;
		}
		scan.close();
	}
}
