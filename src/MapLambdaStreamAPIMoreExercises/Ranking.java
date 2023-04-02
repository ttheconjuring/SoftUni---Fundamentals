package MapLambdaStreamAPIMoreExercises;

import java.util.*;

public class Ranking {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        Map<String, String> contestPasswordMap = new LinkedHashMap<>();

        while (!input.equals("end of contests")) {
            String[] inputArray = input.split(":");
            String contest = inputArray[0];
            String passwordForContest = inputArray[1];
            contestPasswordMap.putIfAbsent(contest, passwordForContest);
            input = sc.nextLine();
        }

        input = sc.nextLine();

        TreeMap<String, Map<String, Integer>> usernameContestPointsMap = new TreeMap<>();

        while (!input.equals("end of submissions")) {
            String[] inputArray = input.split("=>");
            String contest = inputArray[0];
            if (contestPasswordMap.containsKey(contest)) {
                String password = inputArray[1];
                if (contestPasswordMap.get(contest).equals(password)) {
                    String username = inputArray[2];
                    int points = Integer.parseInt(inputArray[3]);
                    usernameContestPointsMap.putIfAbsent(username, new LinkedHashMap<>());
                    usernameContestPointsMap.get(username).putIfAbsent(contest, points);
                    if (usernameContestPointsMap.get(username).get(contest) < points) {
                        usernameContestPointsMap.get(username).put(contest, points);
                    }
                }
            }
            input = sc.nextLine();
        }

        Map<String, Integer> usernamePointsMap = new LinkedHashMap<>();
        for (Map.Entry<String, Map<String, Integer>> stringMapEntry : usernameContestPointsMap.entrySet()) {
            usernamePointsMap.putIfAbsent(stringMapEntry.getKey(), 0);
            int sum = 0;
            for (Map.Entry<String, Integer> stringIntegerEntry : stringMapEntry.getValue().entrySet()) {
                sum += stringIntegerEntry.getValue();
            }
            usernamePointsMap.put(stringMapEntry.getKey(), sum);
        }
        String winner = "";
        int points = 0;
        for (Map.Entry<String, Integer> stringIntegerEntry : usernamePointsMap.entrySet()) {
            if (stringIntegerEntry.getValue() > points) {
                points = stringIntegerEntry.getValue();
                winner = stringIntegerEntry.getKey();
            }
        }
        System.out.println("Best candidate is " + winner + " with total " + points + " points.");

        System.out.println("Ranking: ");
        for (Map.Entry<String, Map<String, Integer>> stringMapEntry : usernameContestPointsMap.entrySet()) {
            System.out.println(stringMapEntry.getKey());
            TreeMap<Integer, String> pointsContestMap = new TreeMap<>(Collections.reverseOrder());
            for (Map.Entry<String, Integer> stringIntegerEntry : usernameContestPointsMap.get(stringMapEntry.getKey()).entrySet()) {
                pointsContestMap.putIfAbsent(stringIntegerEntry.getValue(), stringIntegerEntry.getKey());
            }
            for (Map.Entry<Integer, String> integerStringEntry : pointsContestMap.entrySet()) {
                System.out.println("#  " + integerStringEntry.getValue() + " -> " + integerStringEntry.getKey());
            }
        }

        sc.close();
    }

}
