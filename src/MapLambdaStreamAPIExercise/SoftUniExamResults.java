package MapLambdaStreamAPIExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniExamResults {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        Map<String, String> usernamePointsMap = new LinkedHashMap<>();
        Map<String, Integer> languageCountMap = new LinkedHashMap<>();

        while (!input.equals("exam finished")) {
            String[] inputArray = input.split("-");
            int n = inputArray.length;
            if (n == 3) {
                String username = inputArray[0];
                String language = inputArray[1];
                languageCountMap.putIfAbsent(language, 0);
                languageCountMap.put(language, languageCountMap.get(language) + 1);
                String points = inputArray[2];
                usernamePointsMap.putIfAbsent(username, points);
                if (Integer.parseInt(usernamePointsMap.get(username)) < Integer.parseInt(points)) {
                    usernamePointsMap.put(username, points);
                }
            } else {
                String username = inputArray[0];
                usernamePointsMap.remove(username);
            }
            input = sc.nextLine();
        }

        System.out.println("Results:");
        for (Map.Entry<String, String> stringStringEntry : usernamePointsMap.entrySet()) {
            System.out.println(stringStringEntry.getKey() + " | " + stringStringEntry.getValue());
        }
        System.out.println("Submissions:");
        for (Map.Entry<String, Integer> stringIntegerEntry : languageCountMap.entrySet()) {
            System.out.println(stringIntegerEntry.getKey() + " - " + stringIntegerEntry.getValue());
        }

        sc.close();
    }

}
