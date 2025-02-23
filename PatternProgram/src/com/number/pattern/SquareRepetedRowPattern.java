package com.number.pattern;

import java.util.Scanner;

public class SquareRepetedRowPattern {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= 1; j++) {

				if (i % 2 == 0) {
					System.out.print("54321");
				} else {
					System.out.print("12345");
				}

			}
			System.out.println();

		}

	}

}
