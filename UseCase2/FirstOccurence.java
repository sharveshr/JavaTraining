package UseCase2;

public class FirstOccurence {
public static void main(String[] args) {
	String sentence = "Hi my name is Sharvesh I am a trainee at hi HI hi Hi hI hIgH fiVe";
	String match = "am";
	String[] words = sentence.split("\\s+"); 
	 for (int i = 0; i < words.length; i++) {
         if (words[i].equalsIgnoreCase(match)) {
             System.out.println(match + " found at index: " + i) ;
             System.out.println("It is the" + i+1 + "th word");
             break;
         }
}
}}
