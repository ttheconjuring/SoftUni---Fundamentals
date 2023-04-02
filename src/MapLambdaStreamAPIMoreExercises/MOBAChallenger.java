package MapLambdaStreamAPIMoreExercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MOBAChallenger {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        Map<String, Map<String, Integer>> playerPositionSkillsMap = new LinkedHashMap<>();

        while (!input.equals("Season end")) {
            String[] inputArray;
            if (input.contains(" -> ")) {
                inputArray = input.split(" -> ");
                String player = inputArray[0];
                playerPositionSkillsMap.putIfAbsent(player, new LinkedHashMap<>());
                String position = inputArray[1];
                int skill = Integer.parseInt(inputArray[2]);
                playerPositionSkillsMap.get(player).putIfAbsent(position, skill);
                if (playerPositionSkillsMap.get(player).get(position) < skill) {
                    playerPositionSkillsMap.get(player).put(position, skill);
                }
            } else {
                inputArray = input.split(" vs ");
                String player1 = inputArray[0];
                if (!playerPositionSkillsMap.containsKey(player1)) {
                    break;
                }
                String player2 = inputArray[1];
                if (!playerPositionSkillsMap.containsKey(player2)) {
                    break;
                }
                for (Map.Entry<String, Integer> stringIntegerEntry1 : playerPositionSkillsMap.get(player1).entrySet()) {
                    for (Map.Entry<String, Integer> stringIntegerEntry2 : playerPositionSkillsMap.get(player2).entrySet()) {
                        if (stringIntegerEntry1.getKey().equals(stringIntegerEntry2.getKey())) {
                            if (stringIntegerEntry1.getValue() > stringIntegerEntry2.getValue()) {
                                playerPositionSkillsMap.remove(player2);
                            } else if (stringIntegerEntry1.getValue() < stringIntegerEntry2.getValue()) {
                                playerPositionSkillsMap.remove(player1);
                            } else {
                                break;
                            }
                        }
                    }
                }
            }
            input = sc.nextLine();
        }

        Map<String, Integer> playerPointsMap = new LinkedHashMap<>();
        for (Map.Entry<String, Map<String, Integer>> stringMapEntry : playerPositionSkillsMap.entrySet()) {
            int totalPoints = 0;
            for (Map.Entry<String, Integer> stringIntegerEntry : stringMapEntry.getValue().entrySet()) {
                totalPoints += stringIntegerEntry.getValue();
            }
            playerPointsMap.putIfAbsent(stringMapEntry.getKey(), totalPoints);
        }

        playerPointsMap.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue()
                        .reversed().thenComparing(Map.Entry.comparingByKey()))
                .forEach(e -> {
                    System.out.println(e.getKey() + ": " + e.getValue() + " skill");
                    playerPositionSkillsMap.get(e.getKey()).entrySet().stream()
                            .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()
                                    .thenComparing(Map.Entry.comparingByKey())).forEach(g -> System.out.println("- " + g.getKey() + " <::> " + g.getValue()));
                });

        sc.close();
    }

}
