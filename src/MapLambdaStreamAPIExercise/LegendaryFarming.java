package MapLambdaStreamAPIExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LegendaryFarming {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Integer> keyMaterialQuantityMap = new LinkedHashMap<>();
        keyMaterialQuantityMap.put("shards", 0);
        keyMaterialQuantityMap.put("fragments", 0);
        keyMaterialQuantityMap.put("motes", 0);

        Map<String, Integer> trashQuantityMap = new LinkedHashMap<>();

        boolean isOver = false;

        while (true) {
            String input = sc.nextLine();
            String[] inputArray = input.split("\\s+");
            int n = inputArray.length;
            for (int i = 0; i < n; i += 2) {
                int quantity = Integer.parseInt(inputArray[i]);
                String material = inputArray[i + 1].toLowerCase();
                if (material.equals("shards")) {
                    keyMaterialQuantityMap.put(material, keyMaterialQuantityMap.get(material) + quantity);
                    if (keyMaterialQuantityMap.get(material) >= 250) {
                        keyMaterialQuantityMap.put(material, keyMaterialQuantityMap.get(material) - 250);
                        System.out.println("Shadowmourne obtained!");
                        isOver = true;
                        break;
                    }
                } else if (material.equals("fragments")) {
                    keyMaterialQuantityMap.put(material, keyMaterialQuantityMap.get(material) + quantity);
                    if (keyMaterialQuantityMap.get(material) >= 250) {
                        keyMaterialQuantityMap.put(material, keyMaterialQuantityMap.get(material) - 250);
                        System.out.println("Valanyr obtained!");
                        isOver = true;
                        break;
                    }
                } else if (material.equals("motes")) {
                    keyMaterialQuantityMap.put(material, keyMaterialQuantityMap.get(material) + quantity);
                    if (keyMaterialQuantityMap.get(material) >= 250) {
                        keyMaterialQuantityMap.put(material, keyMaterialQuantityMap.get(material) - 250);
                        System.out.println("Dragonwrath obtained!");
                        isOver = true;
                        break;
                    }
                } else {
                    trashQuantityMap.putIfAbsent(material, 0);
                    trashQuantityMap.put(material, trashQuantityMap.get(material) + quantity);
                }
            }
            if (isOver) {
                break;
            }
        }

        for (Map.Entry<String, Integer> stringIntegerEntry : keyMaterialQuantityMap.entrySet()) {
            System.out.println(stringIntegerEntry.getKey() + ": " + stringIntegerEntry.getValue());
        }
        for (Map.Entry<String, Integer> stringIntegerEntry : trashQuantityMap.entrySet()) {
            System.out.println(stringIntegerEntry.getKey() + ": " + stringIntegerEntry.getValue());
        }

        sc.close();
    }

}
