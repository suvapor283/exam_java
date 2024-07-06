package com.exam.lottoExam;

import java.util.Scanner;

public class LottoSystem {

	public static void main(String[] args) {

		// 1부터 45번의 공을 모두 가짐.
		int[] lottoMachine = new int[45];
		// 선택된 로또번호를 저장할 배열
		int[] lottoBalls = new int[6];
		// 보너스 번호를 저장할 변수
		int bonusNumber = 0;

		// 1부터 45번의 공을 생성
		for (int i = 0; i < 45; i++) {
			lottoMachine[i] = i + 1;
		}

		int count = 0;

		while (count < 7) {
			// 공을 선택하는 위치를 랜덤함수로 pick !
			// 이 변수는 공의 번호가 아니라 인덱스 번호이므로 0~44가 나와야 함. 그래서 뒤의 +1은 빼준다.
			int index = (int) (Math.random() * 45);

			// 중복 값을 뽑을 수 없기 때문에 이미 선택된 index는 값이 0으로 바꿔준다.
			// index의 값이 0이 아니면 아직 미사용, 0이면 이미 뽑힌수
			if (lottoMachine[index] != 0) {

				if (count < 6) {
					lottoBalls[count++] = lottoMachine[index];
				} else {
					bonusNumber = lottoMachine[index];
					count++;
				}
				// 사용했다는 증명
				lottoMachine[index] = 0;
			}
		}

		// 사용자의 로또 번호 선택
		count = 0;
		Scanner scan = new Scanner(System.in);
		// 사용자의 로또 저장 배열
		int[] userLotto = new int[6];

		while (count < 6) {
			System.out.print((count + 1) + "번째 번호를 입력하세요 :");
			int balls = scan.nextInt();
			if (balls >= 45) {
				System.out.println("1 ~ 45 사이의 숫자를 입력해주세요");
				continue;
			}

			// 중복체크
			for (int i = 0; i < count; i++) {
				if (userLotto[i] == balls) {
					System.out.println(balls + "는 이미 존재하는 번호입니다.");
					balls = 0;
					break;
				}
			}
			if (balls != 0) {
				userLotto[count++] = balls;
			}
		}
		scan.close();

		System.out.print("사용자 로또 : ");
		for (int i = 0; i < lottoBalls.length; i++) {
			System.out.print(userLotto[i] + " ");
		}
		System.out.println();

		int matchCount = 0;
		boolean isBonus = false;

		// 로또 번호 비교
		for (int i = 0; i < userLotto.length; i++) {
			for (int j = 0; j < lottoBalls.length; j++) {
				if (userLotto[i] == lottoBalls[j]) {
					matchCount++;
					break;
				}
			}

			// 보너스 번호 비교
			if (!isBonus) {
				if (userLotto[i] == bonusNumber) {
					isBonus = true;
				}
			}
		}
		// system 로또 번호 생성 검증
				System.out.print("시스템 로또 : ");
				for (int i = 0; i < lottoBalls.length; i++) {
					System.out.print(lottoBalls[i] + " ");
				}
				System.out.println("보너스 번호 : " + bonusNumber);
				
		// 등수 출력
		if (matchCount == 6) {
			System.out.println("1등입니다.");
		}
		else if (matchCount == 5 && isBonus) {
			System.out.println("2등입니다.");
		}
		else if (matchCount == 5) {
			System.out.println("3등입니다.");
		}
		else if (matchCount == 4) {
			System.out.println("4등입니다.");
		}
		else if (matchCount == 3) {
			System.out.println("5등입니다.");
		}
		else {
			System.out.println("꽝");
		}
	}
}
