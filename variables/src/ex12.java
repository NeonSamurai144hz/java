public class ex12 {
    public static void main(String[] args) {

        String myString = "42424242"; // original string
		System.out.println("Original Sentence: \t\t\t" + myString);

		// Example 1 using String replace(char, char)
		String myString42 = "42"; // replacing character
		String newCharacter = "quarante-deux"; // character to be replaced
            String updatedString = myString.replace(myString42, newCharacter);    
		System.out.println("After replacing '" + myString42 + "' with '" + 
		// 'a' is replaced and not with 'A' as the method is case sensitive
		newCharacter + "': \t\t" + updatedString);
    }
}