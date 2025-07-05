package UseCase;

import java.util.Scanner;

public class Factorial {
public int factorial(int a) {
		if(a<0) {
			return -1;
		}
		else if(a==0||a==1) {
			return 1;
		}
		else {
			return a*factorial(a-1);
		}
}
public static void main(String[] args) {
	//(2) Write a java program to find the Factorial of a number
	System.out.println("Enter a positive integer");
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	Factorial f =new Factorial();
	System.out.println(f.factorial(a));
	sc.close();
	
}
}
