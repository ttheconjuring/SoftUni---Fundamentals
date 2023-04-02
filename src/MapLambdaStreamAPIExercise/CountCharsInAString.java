package MapLambdaStreamAPIExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        int n = input.length();

        Map<Character, Integer> charsCounterMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            char currentCharacter = input.charAt(i);
            if (currentCharacter == ' ') {
                continue;
            }
            charsCounterMap.putIfAbsent(currentCharacter, 0);
            charsCounterMap.put(currentCharacter, charsCounterMap.get(currentCharacter) + 1);
        }

        for (Map.Entry<Character, Integer> characterIntegerEntry : charsCounterMap.entrySet()) {
            System.out.println(characterIntegerEntry.getKey() + " -> " + characterIntegerEntry.getValue());
        }

        sc.close();
    }
}
