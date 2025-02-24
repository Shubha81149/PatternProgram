package com.number.pattern;

import java.util.Scanner;

public class RightUpperTriangleIncrementNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");//3
		int n = sc.nextInt();

		int sp = 0;
		int k =1;

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= sp; j++) {

				System.out.print(" ");
			}
			for (int j = i; j <= n; j++) {

				System.out.print(k);
				k++;
			}
			System.out.println();
			sp++;
		}

	}
}
