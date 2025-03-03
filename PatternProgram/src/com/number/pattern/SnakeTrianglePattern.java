package com.number.pattern;

import java.util.Scanner;

public class SnakeTrianglePattern {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			if (i % 2 != 0) {

				int x = i-1;
				x = (x*(x+1))/2;

				for (int j = 1; j <= i; j++) {

					x++;
					System.out.print(x+"\t");
					
				}
			} else {

				int y = (i*(i+1))/2;
				for (int j = 1; j <= i; j++) {

					System.out.print(y+"\t");
					y--;
				}
			}
			System.out.println();
		}


	}

}
