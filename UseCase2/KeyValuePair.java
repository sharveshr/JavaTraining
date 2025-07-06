package UseCase2;

import java.util.HashMap;
import java.util.Map;

public class KeyValuePair {
public static void main(String[] args) {
	Map<Integer,String> treasure = new HashMap<>();
	treasure.put(1,"Bermuda");
	treasure.put(2, "Antarctica");
	treasure.put(3, "Sri Lanka");
	treasure.put(4, "Egypt");
	treasure.put(5, "Greece");
	System.out.println("Key Value Pair: " + treasure);
}
}
