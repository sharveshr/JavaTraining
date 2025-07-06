package UseCase2;

import java.util.Arrays;
import java.util.List;

public class ColourOccurrence {
public static void main(String[] args) {
	List<String> colours = Arrays.asList("Yellow", "Red", "Green", "Magenta", "Red", "Blue", "White", "Red", "Green");
	int j=0;
	int k=0;
	for(String i:colours) {
		if("Green".equals(i)) {
			k++;
		}
		if("Red".equals(i)) {
			colours.set(j,"Green");
			k++;
		}
		j++;
	}
	System.out.println(colours);
	System.out.println("The count of Green is: " + k);
}
}
