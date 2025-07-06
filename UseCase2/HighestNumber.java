package UseCase2;

import java.util.ArrayList;
import java.util.List;

public class HighestNumber {
public static void main(String[] args) {
	List<Integer> numbers = new ArrayList<>();
	numbers.add(1);
	numbers.add(2);
	numbers.add(9);
	numbers.add(0);
	numbers.add(199);
	System.out.println("The ArrayList Collection is: " + numbers);
	int a = Integer.MIN_VALUE;
	for(int i:numbers) {
		if(i>a) {
			a=i;
		}
	}
	System.out.println("The maximum number is: " + a);
}
}
