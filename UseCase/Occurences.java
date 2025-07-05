package UseCase;

public class Occurences {
	public int countWordOccurrences(String sentence, String word) {
        String[] words = sentence.split("\\s+"); 
        int count = 0;
        for (String w : words) {
            if (w.equalsIgnoreCase(word)) {
                count++;
            }
        }
        return count;
    }
	public static void main(String[] args) {
		Occurences o = new Occurences();
		String sentence = "Hello Hi How are you HI HI HI HIGH";
		String match = "Hi";
		int count = o.countWordOccurrences(sentence, match);
		        System.out.println("The word '" + match + "' appears " + count + " times.");

	}

}
