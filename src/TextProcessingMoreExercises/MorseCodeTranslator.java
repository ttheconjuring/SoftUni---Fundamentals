package TextProcessingMoreExercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MorseCodeTranslator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, String> morseCodeLetterMap = new LinkedHashMap<>();
        morseCodeLetterMap.put(".-", "A");
        morseCodeLetterMap.put("-...", "B");
        morseCodeLetterMap.put("-.-.", "C");
        morseCodeLetterMap.put("-..", "D");
        morseCodeLetterMap.put(".", "E");
        morseCodeLetterMap.put("..-.", "F");
        morseCodeLetterMap.put("--.", "G");
        morseCodeLetterMap.put("....", "H");
        morseCodeLetterMap.put("..", "I");
        morseCodeLetterMap.put(".---", "J");
        morseCodeLetterMap.put("-.-", "K");
        morseCodeLetterMap.put(".-..", "L");
        morseCodeLetterMap.put("--", "M");
        morseCodeLetterMap.put("-.", "N");
        morseCodeLetterMap.put("---", "O");
        morseCodeLetterMap.put(".--.", "P");
        morseCodeLetterMap.put("--.-", "Q");
        morseCodeLetterMap.put(".-.", "R");
        morseCodeLetterMap.put("...", "S");
        morseCodeLetterMap.put("-", "T");
        morseCodeLetterMap.put("..-", "U");
        morseCodeLetterMap.put("...-", "V");
        morseCodeLetterMap.put(".--", "W");
        morseCodeLetterMap.put("-..-", "X");
        morseCodeLetterMap.put("-.--", "Y");
        morseCodeLetterMap.put("--..", "Z");

        String rawMorseCode = sc.nextLine();
        String processedMorseCode = rawMorseCode.replaceAll("\\|", "");
        String[] morseCodeArray = processedMorseCode.split("  ");
        int n = morseCodeArray.length;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String currentMorseCode = morseCodeArray[i];
            String[] currentMorseCodeArray = currentMorseCode.split(" ");
            int m = currentMorseCodeArray.length;
            for (int j = 0; j < m; j++) {
                sb.append(morseCodeLetterMap.get(currentMorseCodeArray[j]));;
            }
            sb.append(" ");
        }

        System.out.println(sb);

        sc.close();
    }

}
