package UseCase;

public class Pattern {
public static void main(String[] args) {
	//(3) Write a java program to display the following pattern
	
	
//	for(int i=7;i==1;i-=2) {
//		for(int j=1;j<=i;j++) {
//			System.out.print("* ");
//		}
//		System.out.println();
//	}
//	for(int i=1;i<4;i++) {
//		for(int j=1;j<=i;j++) {
//			System.out.print("* ");
//		}
//		System.out.println();
//	}
	
	 for (int i = 0; i < 4; i++) {
         for (int j = 0; j < i; j++) {
             System.out.print("  ");
         }
         for (int j = 0; j < 7 - 2 * i; j++) {
             System.out.print("* ");
         }
         System.out.println();
     }

     for (int i = 1; i < 4; i++) {
         for (int j = 0; j < 3 - i; j++) {
             System.out.print("  ");
         }
         for (int j = 0; j < 1 + 2 * i; j++) {
             System.out.print("* ");
         }
         System.out.println();
     }
 }
}

