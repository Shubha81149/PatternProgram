package com.star.pattern;

import java.util.Scanner;

public class RightUpperTriangle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n = sc.nextInt();

		int sp = 0;

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= sp; j++) {

				System.out.print(" ");
			}
			for (int j = i; j <= n; j++) {

				System.out.print("*");
			}
			System.out.println();
			sp++;
		}

	}

}
