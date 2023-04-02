package FinalExamPreparation;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiDetector {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        long coolThreshold = 1;
        for (Character currentCharacter : input.toCharArray()) {
            if (Character.isDigit(currentCharacter)) {
                coolThreshold = coolThreshold * Long.parseLong(String.valueOf(currentCharacter));
            }
        }

        String regex = "(:{2}|\\*{2})[A-Z][a-z]{2,}\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        Map<String, Long> emojiCoolnessMap = new LinkedHashMap<>();

        while (matcher.find()) {
            String emoji = matcher.group();
            long coolness = 0;
            for (Character currentCharacter : emoji.toCharArray()) {
                if (Character.isLetter(currentCharacter)) {
                    coolness += currentCharacter;
                }
            }
            emojiCoolnessMap.putIfAbsent(emoji, coolness);
        }

        System.out.println("Cool threshold: " + coolThreshold);
        System.out.println(emojiCoolnessMap.size() + " emojis found in the text. The cool ones are: ");
        for (Map.Entry<String, Long> stringLongEntry : emojiCoolnessMap.entrySet()) {
            if(stringLongEntry.getValue() >= coolThreshold) {
                System.out.println(stringLongEntry.getKey());
            }
        }

        sc.close();
    }

}
