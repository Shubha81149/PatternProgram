package com.hollow.pattern;

import java.util.Scanner;

public class HollowRightLowerTriangle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n = sc.nextInt();

		int sp = n - 1;

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= sp; j++) {

				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {

				if (j == 1 || j == i || i == n) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
			sp--;
		}

	}

}
