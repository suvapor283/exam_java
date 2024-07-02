package com.exam.exam02;

public class ChangeCharExam {
	
	public static void main(String[] args) {
		
		char ch = 'E';
		int num = 90;
		
		int chToNum = 0;
		char intToCh = ' '; // char은 공백을 넣을 때 띄어쓰기 하나를 넣어주어야 한다. ('\0'도 가능)

		// char -> int 로 변경할 때는 자동형변환
		// int -> char 로 변경할 때는 강제형변환
		chToNum = ch;
		intToCh = (char)num;
		
		System.out.println(chToNum);
		System.out.println(intToCh);
	}
}