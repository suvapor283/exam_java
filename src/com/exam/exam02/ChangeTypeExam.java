package com.exam.exam02;

public class ChangeTypeExam {

	public static void main(String[] args) {
		
		int num01 = 15;
		long lyNum01 = 20;
		byte byNum01 = 0;
		
		// 자동형변환
		lyNum01 = num01;
		
		// 강제형변환
		byNum01 = (byte)num01;
		
		int num02 = 130;
		byte byNum02 = 0;
		
		byNum02 = (byte)num02;
		
		System.out.println("형변환1 int " + num01 + " -> long " + lyNum01);
		System.out.println("형변환1 int " + num01 + " -> byte " + byNum01);
		System.out.println("형변환1 int " + num02 + " -> byte " + byNum02);
	}
}
