package TextProcessingExercise;

import java.util.Scanner;

public class ReplaceRepeatingChars {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        for (int i = 0; i < input.length(); i++) {
            char currentCharacter = input.charAt(i);
            StringBuilder repeatString = new StringBuilder();
            for (int j = i; j <= input.length(); j++) {
                if(j == input.length()) {
                    input = input.replace(repeatString, currentCharacter + "");
                    break;
                }
                if (input.charAt(j) == currentCharacter) {
                    repeatString.append(currentCharacter);
                } else {
                    input = input.replace(repeatString, currentCharacter + "");
                    break;
                }
            }
        }

        System.out.println(input);

        sc.close();
    }

}

