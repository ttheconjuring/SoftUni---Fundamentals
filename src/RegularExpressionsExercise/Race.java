package RegularExpressionsExercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Race {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] participants = sc.nextLine().split(",\\s+");
        int n = participants.length;
        Map<String, Integer> participantDistanceMap = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            participantDistanceMap.putIfAbsent(participants[i], 0);
        }

        String lettersRegex = "[A-Za-z]";
        Pattern lettersPattern = Pattern.compile(lettersRegex);

        String digitsRegex = "[0-9]";
        Pattern digitsPattern = Pattern.compile(digitsRegex);

        String input = sc.nextLine();

        while (!input.equals("end of race")) {
            Matcher lettersMatcher = lettersPattern.matcher(input);
            StringBuilder sb = new StringBuilder();
            while (lettersMatcher.find()) {
                sb.append(lettersMatcher.group());
            }
            if (participantDistanceMap.containsKey(sb.toString())) {
                Matcher digitsMatcher = digitsPattern.matcher(input);
                int distance = 0;
                while (digitsMatcher.find()) {
                    distance += Integer.parseInt(digitsMatcher.group());
                }
                participantDistanceMap.put(sb.toString(), participantDistanceMap.get(sb.toString()) + distance);
            }
            input = sc.nextLine();
        }

        System.out.println("1st place: " + participants[0]);
        System.out.println("2nd place: " + participants[1]);
        System.out.println("3rd place: " + participants[2]);

        sc.close();
    }

}
