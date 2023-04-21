package MapLambdaStreamAPIMoreExercises;

import java.util.*;

public class DragonArmy {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        Map<String, TreeMap<String, List<String>>> dragonTypeAndFullInformationMap = new LinkedHashMap<>();

        List<String> typesList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String dragonInformation = sc.nextLine();
            String[] dragonInformationArray = dragonInformation.split(" ");
            String type = dragonInformationArray[0];
            String name = dragonInformationArray[1];
            String damage = dragonInformationArray[2];
            if (damage.equals("null")) {
                damage = "45";
            }
            String health = dragonInformationArray[3];
            if (health.equals("null")) {
                health = "250";
            }
            String armor = dragonInformationArray[4];
            if (armor.equals("null")) {
                armor = "10";
            }
            if (!dragonTypeAndFullInformationMap.containsKey(type)) {
                dragonTypeAndFullInformationMap.putIfAbsent(type, new TreeMap<>());
                typesList.add(type);
            }
            if (!dragonTypeAndFullInformationMap.get(type).containsKey(name)) {
                dragonTypeAndFullInformationMap.get(type).putIfAbsent(name, new ArrayList<>());
                dragonTypeAndFullInformationMap.get(type).get(name).add(damage);
                dragonTypeAndFullInformationMap.get(type).get(name).add(health);
                dragonTypeAndFullInformationMap.get(type).get(name).add(armor);
            } else {
                dragonTypeAndFullInformationMap.get(type).get(name).set(0, damage);
                dragonTypeAndFullInformationMap.get(type).get(name).set(1, health);
                dragonTypeAndFullInformationMap.get(type).get(name).set(2, armor);
            }
        }

        printAll(typesList, dragonTypeAndFullInformationMap);

        sc.close();
    }

    public static void printAll(List<String> typesList, Map<String, TreeMap<String, List<String>>> dragonTypeAndFullInformationMap) {
        for (String type : typesList) {
            double totalDamage = 0;
            double totalHealth = 0;
            double totalArmor = 0;
            for (Map.Entry<String, TreeMap<String, List<String>>> stringTreeMapEntry : dragonTypeAndFullInformationMap.entrySet()) {
                if (stringTreeMapEntry.getKey().equals(type)) {
                    for (Map.Entry<String, List<String>> stringListEntry : stringTreeMapEntry.getValue().entrySet()) {
                        totalDamage += Double.parseDouble(stringListEntry.getValue().get(0));
                        totalHealth += Double.parseDouble(stringListEntry.getValue().get(1));
                        totalArmor += Double.parseDouble(stringListEntry.getValue().get(2));
                    }
                }
            }
            double averageDamage = totalDamage / dragonTypeAndFullInformationMap.get(type).size();
            double averageHealth = totalHealth / dragonTypeAndFullInformationMap.get(type).size();
            double averageArmor = totalArmor / dragonTypeAndFullInformationMap.get(type).size();
            System.out.printf("%s::(%.2f/%.2f/%.2f)%n", type, averageDamage, averageHealth, averageArmor);
            for (Map.Entry<String, TreeMap<String, List<String>>> stringTreeMapEntry : dragonTypeAndFullInformationMap.entrySet()) {
                if (stringTreeMapEntry.getKey().equals(type)) {
                    for (Map.Entry<String, List<String>> stringListEntry : stringTreeMapEntry.getValue().entrySet()) {
                        System.out.printf("-%s -> damage: %s, health: %s, armor: %s%n", stringListEntry.getKey(), stringListEntry.getValue().get(0), stringListEntry.getValue().get(1), stringListEntry.getValue().get(2));
                    }
                }
            }
        }
    }
}


