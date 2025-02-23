package com.star.pattern;

import java.util.Scanner;

public class ButterflyPattern {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n = sc.nextInt();

		if (n % 2 != 0)
			n += 1;

		int st = 1;
		int sp = n - 2;

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= st; j++) {

				System.out.print("*");
			}
			for (int j = 1; j <= sp; j++) {

				System.out.print(" ");
			}
			for (int j = 1; j <= st; j++) {

				System.out.print("*");
			}
			System.out.println();

			if (i < n / 2) {

				sp -= 2;
				st++;
			} else {

				sp += 2;
				st--;
			}
		}

	}

}
