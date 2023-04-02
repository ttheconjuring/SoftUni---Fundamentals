package FinalExamPreparation;

import java.util.*;

public class HeroesOfCodeAndLogic7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        Map<String, List<Integer>> heroNameHpMpMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String heroInfo = sc.nextLine();
            String[] heroInfoArray = heroInfo.split("\\s+");
            String heroName = heroInfoArray[0];
            int hp = Integer.parseInt(heroInfoArray[1]);
            int mp = Integer.parseInt(heroInfoArray[2]);
            heroNameHpMpMap.putIfAbsent(heroName, new ArrayList<>());
            heroNameHpMpMap.get(heroName).add(hp);
            heroNameHpMpMap.get(heroName).add(mp);
        }

        String command = sc.nextLine();

        String heroName;
        int amount;
        int currentHp;
        int mpNeeded;

        while (!command.equals("End")) {
            String[] commandArray = command.split(" - ");
            switch (commandArray[0]) {
                case "CastSpell":
                    heroName = commandArray[1];
                    mpNeeded = Integer.parseInt(commandArray[2]);
                    String spellName = commandArray[3];
                    int currentMp = heroNameHpMpMap.get(heroName).get(1);
                    if (currentMp >= mpNeeded) {
                        heroNameHpMpMap.get(heroName).set(1, currentMp - mpNeeded);
                        System.out.println(heroName + " has successfully cast " + spellName + " and now has " + heroNameHpMpMap.get(heroName).get(1) + " MP!");
                    } else {
                        System.out.println(heroName + " does not have enough MP to cast " + spellName + "!");
                    }
                    break;
                case "TakeDamage":
                    heroName = commandArray[1];
                    int damage = Integer.parseInt(commandArray[2]);
                    String attacker = commandArray[3];
                    currentHp = heroNameHpMpMap.get(heroName).get(0);
                    if (currentHp - damage > 0) {
                        heroNameHpMpMap.get(heroName).set(0, currentHp - damage);
                        System.out.println(heroName + " was hit for " + damage + " HP by " + attacker + " and now has " + heroNameHpMpMap.get(heroName).get(0) + " HP left!");
                    } else {
                        System.out.println(heroName + " has been killed by " + attacker + "!");
                        heroNameHpMpMap.remove(heroName);
                    }
                    break;
                case "Recharge":
                    heroName = commandArray[1];
                    amount = Integer.parseInt(commandArray[2]);
                    currentMp = heroNameHpMpMap.get(heroName).get(1);
                    mpNeeded = 200 - currentMp;
                    if (currentMp + amount > 200) {
                        heroNameHpMpMap.get(heroName).set(1, 200);
                        System.out.println(heroName + " recharged for " + mpNeeded + " MP!");
                    } else {
                        heroNameHpMpMap.get(heroName).set(1, currentMp + amount);
                        System.out.println(heroName + " recharged for " + amount + " MP!");
                    }
                    break;
                case "Heal":
                    heroName = commandArray[1];
                    amount = Integer.parseInt(commandArray[2]);
                    currentHp = heroNameHpMpMap.get(heroName).get(0);
                    int hpNeeded = 100 - currentHp;
                    if (currentHp + amount > 100) {
                        heroNameHpMpMap.get(heroName).set(0, 100);
                        System.out.println(heroName + " healed for " + hpNeeded + " HP!");
                    } else {
                        heroNameHpMpMap.get(heroName).set(0, currentHp + amount);
                        System.out.println(heroName + " healed for " + amount + " HP!");
                    }
                    break;
            }
            command = sc.nextLine();
        }

        for (Map.Entry<String, List<Integer>> stringListEntry : heroNameHpMpMap.entrySet()) {
            System.out.println(stringListEntry.getKey());
            System.out.println("  HP: " + stringListEntry.getValue().get(0));
            System.out.println("  MP: " + stringListEntry.getValue().get(1));
        }

        sc.close();
    }

}
