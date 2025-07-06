package UseCase2;

import java.util.Scanner;

public class Armstrong {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Input a number to check for Armstrong: ");
	String input = sc.next();
	sc.close();
	int leng = input.length();
	int number = Integer.parseInt(input);
	int sum = 0;
	int modulus;
	for(int i=0;i<leng;i++) {
		modulus = number%10;
		sum+=Math.pow(modulus, leng);
		number/=10;
		
	}
	if(sum==Integer.parseInt(input)) {
		System.out.println("It is an Armstrong number");
	}
	else {
		System.out.println("It is not an Armstrong number");
	}
}
}
