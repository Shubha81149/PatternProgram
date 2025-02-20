package com.hollow.pattern;

import java.util.Scanner;

public class HollowRightPiramid {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n = sc.nextInt();

		int st = 1;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {

				System.out.print(" ");
			}
			for (int j = 1; j <= st; j++) {

				if (j == 1 || j == st) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();

			if (i <= n / 2) {

				st++;
			} else {

				st--;
			}
		}

	}
}
