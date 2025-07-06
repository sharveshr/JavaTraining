package UseCase2;

import java.util.ArrayList;
import java.util.Arrays;

public class UniqueColours {
public static void main(String[] args) {
	ArrayList<String> unicolour = new ArrayList<>(Arrays.asList("White", "Red", "Green", "Violet", "Red", "Blue", "White", "Red", "Green"));
	unicolour.add(3,"Pink");
	System.out.println("Original array" + unicolour);
	for(int i=0;i<unicolour.size();i++) {
		for(int j=i+1;j<unicolour.size();j++) {
			if(unicolour.get(i).equals(unicolour.get(j))){
				unicolour.remove(j);
				j--;
			}
		}
	}
	System.out.println("Unique colours:" + unicolour);
}
}
