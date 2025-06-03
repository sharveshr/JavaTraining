package com.Training.dayTwo;
import java.lang.Math;
public class PrimeNumber {
	public static void main(String[] args) {
		int n=9;
		if(n==1 || n==0) {
			System.out.println("Neither prime nor composite");
		}
		else if(n==2) {
			System.out.println("Even prime number");
		}
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				System.out.println("It is Composite");
				return;
			}
		}
		System.out.println("It is a prime number");
	}
}
