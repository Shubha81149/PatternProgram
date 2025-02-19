package com.hollow.pattern;

import java.util.Scanner;

public class HollowUpperTriangle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {

				if (j == i || j == n || i == 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
