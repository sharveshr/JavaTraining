package com.Training.dayOne;
import java.util.*;
public class DecreasingStarPatternWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int rows = sc.nextInt();
		sc.close();
		int i=rows,j=0;
		while(i>=0) {
			j=1;
			while(j<=i) {
				System.out.print("* ");
				j++;
			}
			System.out.println();
			i--;
		}
		
	}
}
