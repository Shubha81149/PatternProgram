package com.number.pattern;

import java.util.Scanner;

public class IncreamentPiramid {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");//3
		int n = sc.nextInt();

		int st = 1;
		int sp = n - 1;
		int k = 1;
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= sp; j++) {

				System.out.print(" ");
			}
			for (int j = 1; j <= st; j++) {

				System.out.print(k);
				k++;
			}
			System.out.println();
			sp--;
			st += 2;
		}

	}

}
