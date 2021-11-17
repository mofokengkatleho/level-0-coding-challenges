import java.util.Stack;

public class task10 {
    public static void commonLetters(String word1, String word2) {
        Stack<String> commonWords = new Stack<>();
        for (int index1 = 0; index1 < word1.length(); index1++) {
            for (int index2 = 0; index2 < word2.length(); index2++) {
                String letter1 = word1.split("")[index1].toLowerCase();
                String letter2 = word2.split("")[index2].toLowerCase();
                if (letter1.equals(letter2) && !commonWords.contains(letter1)) {
                    commonWords.push(letter1);
                }

            }
        }
        System.out.printf("%nCommon words:");
        for (int index = 0; index < commonWords.size(); index++) {
            System.out.printf(" %s", commonWords.elementAt(index));
            if (index != commonWords.size() - 1) {
                System.out.printf(",");
            } else {
                System.out.printf("%n");
            }
        }

    }

    public static void main(String[] args) {
        commonLetters("house", "computers");

    }
}