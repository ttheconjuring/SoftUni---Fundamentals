package TextProcessingExercise;

import java.util.Scanner;

public class CaesarCipher {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        System.out.println(encrypt(input));

        sc.close();
    }

    private static String encrypt(String input) {
        StringBuilder result = new StringBuilder();
        int n = input.length();
        for (int i = 0; i < n; i++) {
            char currentCharacter = input.charAt(i);
            char newCharacter = (char) (currentCharacter + 3);
            result.append(newCharacter);
        }
        return result.toString();
    }

}
