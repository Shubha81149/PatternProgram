package com.number.pattern;

import java.util.Scanner;

public class ReverseRowPiramid {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n = sc.nextInt();

		int st = n;
		int sp = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= sp; j++) {

				System.out.print(" ");
			}
			for (int j = 1; j <= st; j++) {

				System.out.print(i);
			}
			System.out.println();
			sp++;
			st -= 2;
		}

	}

}
