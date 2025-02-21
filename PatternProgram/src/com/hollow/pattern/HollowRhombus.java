package com.hollow.pattern;

import java.util.Scanner;

public class HollowRhombus {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");// 3
		int n = sc.nextInt();

		int sp = n - 1;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= sp; j++) {

				System.out.print(" ");
			}
			for (int j = 1; j <= n; j++) {

				if (i == 1 || i == n || j == 1 || j == n) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}

			}
			System.out.println();
			sp--;
		}

	}

}
