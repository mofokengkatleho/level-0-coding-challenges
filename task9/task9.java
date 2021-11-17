import java.util.Stack;

public class task9 {
    public static void checkVowels(String word) {
        String[] vowels = new String[] { "a", "e", "i", "o", "u" };
        Stack<String> results = new Stack<>();

        for (String letter : word.split("")) {
            for (int index = 0; index < vowels.length; index++) {
                if (letter.toLowerCase().equals(vowels[index]) && !(results.contains(letter.toLowerCase()))) {
                    results.push(letter.toLowerCase());
                }
            }
        }
        System.out.printf("Vowels:");
        for (int index = 0; index < results.size(); index++) {
            System.out.printf(" %s", results.elementAt(index));
            if (index != results.size() - 1) {
                System.out.printf(",");
            } else {
                System.out.printf("%n");
            }
        }
    }

    public static void main(String[] args) {
        checkVowels("Umuzi");

    }
}