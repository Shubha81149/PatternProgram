package com.number.pattern;

import java.util.Scanner;

public class SquareIncreamentPattern {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();

		int k = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				 
				System.out.print(k+"\t");
				k++;
			}
			System.out.println();
		}
	}

}
