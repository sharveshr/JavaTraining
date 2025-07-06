package UseCase2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DistinctCount {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String sentence = sc.nextLine();
	sc.close();
	Map<Character, Integer> mapping = new HashMap<>();
	for(char i: sentence.toCharArray() ) {
		mapping.put(i, mapping.getOrDefault(i, 0)+1);
	}
	for (Map.Entry<Character, Integer> entry : mapping.entrySet()) {
        System.out.println(entry.getKey() + " = " + entry.getValue());
    }
}
}
