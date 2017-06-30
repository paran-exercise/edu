package com.paran.chapter13;

public class MultyDimentionArray {

	/*
	 * 2차원 배열 선언 배열 2 x 3 생성 두개의 배열의 배열값 for문을 통해 호출 출력사항 : 0 과 1을 대한 점수를 출력
	 * 
	 */

	public static void main(String[] args) {

		int[][] score;
		score = new int[2][4];

		score[0][0] = 10;
		score[0][1] = 20;
		score[0][2] = 30;
		score[0][3] = 40;
		score[1][0] = 50;
		score[1][1] = 60;
		score[1][2] = 70;
		score[1][3] = 80;
		
		for (int i = 0; i < score.length; i++) {
			System.out.println((i + 1) + "번째 사람의 점수는" + score[0][i] + "입니다");
			System.out.println((i + 1) + "번째 사람의 점수는" + score[1][i] + "입니다");
		}

	}

}
