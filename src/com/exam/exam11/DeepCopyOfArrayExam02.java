package com.exam.exam11;

public class DeepCopyOfArrayExam02 {

	public static void main(String[] args) {
		
		int[] cards = {1, 6, 9, 8, 2, 7};
		int[] newCards = new int[6];
		
		// 복사 메서드를 활용한 깊은 복사
		System.arraycopy(cards, 0, newCards, 0, newCards.length);
		
		cards[1] = 11;
		newCards[3] = 30; 
		
		System.out.print("cards : ");
		for (int i = 0; i < cards.length; i++) {
			System.out.print(cards[i] + " ");
		}
		System.out.println();
		
		System.out.print("newcards : ");
		for (int i = 0; i < newCards.length; i++) {
			System.out.print(newCards[i] + " ");
		}
	}
}