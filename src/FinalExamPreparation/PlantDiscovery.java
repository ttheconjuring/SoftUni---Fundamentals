package FinalExamPreparation;

import java.util.*;

public class PlantDiscovery {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        if (n == 0) {
            return;
        }

        Map<String, Integer> plantRarityMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String plantInformation = sc.nextLine();
            String[] plantInformationArray = plantInformation.split("<->");
            String plant = plantInformationArray[0];
            int rarity = Integer.parseInt(plantInformationArray[1]);
            plantRarityMap.putIfAbsent(plant, rarity);
            plantRarityMap.put(plant, rarity);
        }

        Map<String, List<Double>> plantRatingMap = new LinkedHashMap<>();

        String command = sc.nextLine();

        while (!command.equals("Exhibition")) {
            if (command.startsWith("Rate: ")) {
                String restOfTheCommand = command.substring(6);
                String[] restOfTheCommandArray = restOfTheCommand.split(" - ");
                String plant = restOfTheCommandArray[0];
                if (plantRarityMap.containsKey(plant)) {
                    double rating = Double.parseDouble(restOfTheCommandArray[1]);
                    plantRatingMap.putIfAbsent(plant, new ArrayList<>());
                    plantRatingMap.get(plant).add(rating);
                } else {
                    System.out.println("error");
                }
            } else if (command.startsWith("Update: ")) {
                String restOfTheCommand = command.substring(8);
                String[] restOfTheCommandArray = restOfTheCommand.split(" - ");
                String plant = restOfTheCommandArray[0];
                if (plantRarityMap.containsKey(plant)) {
                    int newRarity = Integer.parseInt(restOfTheCommandArray[1]);
                    plantRarityMap.put(plant, newRarity);
                } else {
                    System.out.println("error");
                }
            } else if (command.startsWith("Reset: ")) {
                String plant = command.substring(7);
                if (plantRarityMap.containsKey(plant)) {
                    plantRatingMap.get(plant).clear();
                } else {
                    System.out.println("error");
                }
            } else {
                System.out.println("error");
            }
            command = sc.nextLine();
        }


        System.out.println("Plants for the exhibition: ");
        for (Map.Entry<String, Integer> stringIntegerEntry : plantRarityMap.entrySet()) {
            double totalRating = 0;
            int counter = 0;
            for (Map.Entry<String, List<Double>> stringListEntry : plantRatingMap.entrySet()) {
                if (stringListEntry.getKey().equals(stringIntegerEntry.getKey())) {
                    for (double rating : stringListEntry.getValue()) {
                        totalRating += rating;
                    }
                    counter = stringListEntry.getValue().size();
                }
            }
            double averageRating = totalRating / counter;
            if (Double.isNaN(averageRating)) {
                averageRating = 0.00;
            }
            System.out.println("- " + stringIntegerEntry.getKey() + "; Rarity: " + stringIntegerEntry.getValue() + "; Rating: " + String.format("%.2f", averageRating));
        }

        sc.close();
    }

}
