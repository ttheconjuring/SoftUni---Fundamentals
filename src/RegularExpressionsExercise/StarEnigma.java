package RegularExpressionsExercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        String decryptingRegex = "[STARstar]";
        Pattern decryptingPattern = Pattern.compile(decryptingRegex);
        String afterDecryptingRegex = "[^@\\-!:>]*@(?<planetName>[A-Za-z]+)[^@\\-!:>]*:(?<planetPopulation>\\d+)[^@\\-!:>]*!(?<attackType>[AD])[^@\\-!:>]*![^@\\-!:>]*->(?<soldierCount>\\d+)[^@\\-!:>]*";
        Pattern afterDecryptingPattern = Pattern.compile(afterDecryptingRegex);

        TreeMap<String, Character> planetNameStatusMap = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String encrypted = sc.nextLine();
            Matcher matcher = decryptingPattern.matcher(encrypted);
            int count = 0;
            while (matcher.find()) {
                count++;
            }
            StringBuilder decrypted = new StringBuilder();
            for (char currentCharacter : encrypted.toCharArray()) {
                decrypted.append((char) (currentCharacter - count));
            }
            matcher = afterDecryptingPattern.matcher(decrypted.toString());
            while (matcher.find()) {
                String planetName = matcher.group("planetName");
                // int planetPopulation = Integer.parseInt(matcher.group("planetPopulation"));
                char attackType = matcher.group("attackType").charAt(0);
                // int soldierCount = Integer.parseInt(matcher.group("soldierCount"));
                planetNameStatusMap.putIfAbsent(planetName, attackType);
            }
        }

        int attackedPlanetsCounter = 0;
        int destroyedPlanetsCounter = 0;
        List<String> attackedPlanetsList = new ArrayList<>();
        List<String> destroyedPlanetsList = new ArrayList<>();
        for (Map.Entry<String, Character> stringCharacterEntry : planetNameStatusMap.entrySet()) {
            if (stringCharacterEntry.getValue() == 'A') {
                attackedPlanetsCounter++;
                attackedPlanetsList.add(stringCharacterEntry.getKey());
            } else {
                destroyedPlanetsCounter++;
                destroyedPlanetsList.add(stringCharacterEntry.getKey());
            }
        }

        System.out.println("Attacked planets: " + attackedPlanetsCounter);
        Collections.sort(attackedPlanetsList);
        for (String planet : attackedPlanetsList) {
            System.out.println("-> " + planet);
        }
        System.out.println("Destroyed planets: " + destroyedPlanetsCounter);
        Collections.sort(destroyedPlanetsList);
        for (String planet : destroyedPlanetsList) {
            System.out.println("-> " + planet);
        }

        sc.close();
    }

}
