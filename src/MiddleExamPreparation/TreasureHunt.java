package MiddleExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TreasureHunt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> initialLoot = Arrays.stream(sc.nextLine().split("\\|")).collect(Collectors.toList());

        String command = sc.nextLine();

        while (!command.equals("Yohoho!")) {
            String[] commandArray = command.split("\\s+");
            switch (commandArray[0]) {
                case "Loot":
                    for (int i = 1; i < commandArray.length; i++) {
                        if (!initialLoot.contains(commandArray[i])) {
                            initialLoot.add(0, commandArray[i]);
                        }
                    }
                    break;
                case "Drop":
                    int index = Integer.parseInt(commandArray[1]);
                    if (index >= 0 && index < initialLoot.size()) {
                        String loot = initialLoot.get(index);
                        initialLoot.remove(loot);
                        initialLoot.add(loot);
                    }
                    break;
                case "Steal":
                    int count = Integer.parseInt(commandArray[1]);
                    if (count > initialLoot.size()) {
                        System.out.println(String.join(", ", initialLoot));
                        initialLoot.clear();
                    } else {
                        System.out.println(String.join(", ", initialLoot.subList(initialLoot.size() - count, initialLoot.size())));
                        initialLoot.subList(initialLoot.size() - count, initialLoot.size()).clear();
                    }
                    break;
            }
            command = sc.nextLine();
        }

        if (initialLoot.isEmpty()) {
            System.out.println("Failed treasure hunt.");
            return;
        }

        int sumOfAllLengths = 0;
        for (String s : initialLoot) {
            sumOfAllLengths += s.length();
        }
        double averageTreasureGain = sumOfAllLengths * 1.0 / initialLoot.size();
        System.out.printf("Average treasure gain: %.2f pirate credits.%n", averageTreasureGain);

        sc.close();
    }

}
