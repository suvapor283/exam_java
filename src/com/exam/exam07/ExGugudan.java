package com.exam.exam07;

public class ExGugudan {

	public static void main(String[] args) {
		
		for (int i = 2; i < 10; i++) {
			
			for (int dan = 1; dan <= 9; dan++) {
				
			System.out.print(i + "*" + dan + "=" + (i * dan) + '\t');
			}
			
			// 내용이 없는 println() 메서드 사용으로 줄바꿈
			System.out.println();
		}
	}
}
