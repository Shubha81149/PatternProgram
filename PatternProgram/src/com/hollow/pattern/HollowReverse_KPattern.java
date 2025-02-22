package com.hollow.pattern;

import java.util.Scanner;

public class HollowReverse_KPattern {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n = sc.nextInt();

		int st = (n / 2) + 1;
		int sp = 0;

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= sp; j++) {

				System.out.print(" ");
			}

			for (int j = 1; j <= st; j++) {

				if (j == 1 || j == st || i == 1 || i == n) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();

			if (i <= n / 2) {

				st--;
				sp++;
			} else {

				st++;
				sp--;
			}
		}

	}

}
