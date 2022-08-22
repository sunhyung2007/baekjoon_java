package sunhyung_baekjoon;

import java.util.Scanner;

public class J1546 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double max = -1;
		double sum = 0.0;
		double[] score = new double[n];

		// 입력값과 최대값 비교 후 최대값 찾기
		for (int i = 0; i < n; i++) {
			score[i] = sc.nextInt();
			if (max < score[i])
				max = score[i];
		}
		
		// 새로운 성적 만들기
		for (int i = 0; i < n; i++) 
			sum += score[i] / max * 100;
		
		System.out.println((sum/n));
	}

}
