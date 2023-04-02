package FinalExamPreparation;

import java.util.*;

public class Pirates {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String command = sc.nextLine();

        Map<String, List<Integer>> cityPopulationGoldMap = new LinkedHashMap<>();

        while (!command.equals("Sail")) {
            String[] commandArray = command.split("\\|\\|");
            String city = commandArray[0];
            int population = Integer.parseInt(commandArray[1]);
            int gold = Integer.parseInt(commandArray[2]);
            if (!cityPopulationGoldMap.containsKey(city)) {
                cityPopulationGoldMap.put(city, new ArrayList<>());
                cityPopulationGoldMap.get(city).add(population);
                cityPopulationGoldMap.get(city).add(gold);
            } else {
                cityPopulationGoldMap.get(city).set(0, cityPopulationGoldMap.get(city).get(0) + population);
                cityPopulationGoldMap.get(city).set(1, cityPopulationGoldMap.get(city).get(1) + gold);
            }
            command = sc.nextLine();
        }

        command = sc.nextLine();

        String town;
        int gold;

        while (!command.equals("End")) {
            String[] commandArray = command.split("=>");
            switch (commandArray[0]) {
                case "Plunder":
                    town = commandArray[1];
                    int people = Integer.parseInt(commandArray[2]);
                    gold = Integer.parseInt(commandArray[3]);
                    cityPopulationGoldMap.get(town).set(0, cityPopulationGoldMap.get(town).get(0) - people);
                    cityPopulationGoldMap.get(town).set(1, cityPopulationGoldMap.get(town).get(1) - gold);
                    System.out.println(town + " plundered! " + gold + " gold stolen, " + people + " citizens killed.");
                    if ((cityPopulationGoldMap.get(town).get(0) == 0) || cityPopulationGoldMap.get(town).get(1) == 0) {
                        System.out.println(town + " has been wiped off the map!");
                        cityPopulationGoldMap.remove(town);
                    }
                    break;
                case "Prosper":
                    town = commandArray[1];
                    gold = Integer.parseInt(commandArray[2]);
                    if (gold < 0) {
                        System.out.println("Gold added cannot be a negative number!");
                    } else {
                        cityPopulationGoldMap.get(town).set(1, cityPopulationGoldMap.get(town).get(1) + gold);
                        System.out.println(gold + " gold added to the city treasury. " + town + " now has " + cityPopulationGoldMap.get(town).get(1) + " gold.");
                    }
                    break;
            }
            command = sc.nextLine();
        }

        if (cityPopulationGoldMap.size() == 0) {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        } else {
            System.out.println("Ahoy, Captain! There are " + cityPopulationGoldMap.size() + " wealthy settlements to go to:");
            for (Map.Entry<String, List<Integer>> stringListEntry : cityPopulationGoldMap.entrySet()) {
                System.out.println(stringListEntry.getKey() + " -> Population: " + stringListEntry.getValue().get(0) + " citizens, Gold: " + stringListEntry.getValue().get(1) + " kg");
            }
        }

        sc.close();
    }

}
