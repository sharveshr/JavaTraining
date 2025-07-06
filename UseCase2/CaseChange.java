package UseCase2;

import java.util.Scanner;

public class CaseChange {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	char a = sc.next().charAt(0);
	sc.close();
	if(a>='A' && a<='Z') {
		a+=32;
	}
	System.out.println("Lowercase is: " + a);
}
}
