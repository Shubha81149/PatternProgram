package com.number.pattern;

import java.util.Scanner;

public class RightLowerTriangleIncrementNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n = sc.nextInt();

		int sp = n-1;
        int k = 1;
        
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= sp; j++) {

				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {

				System.out.print(k);
				k++;
			}
			System.out.println();
			sp--;
		}

	}

}
