package RegularExpressionsExercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NetherRealms {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] participant = input.split(",");
        int n = participant.length;
        for (int i = 0; i < n; i++) {
            participant[i] = participant[i].trim();
        }

        String healthRegex = "[^\\d+\\-*/.]";
        Pattern healthPattern = Pattern.compile(healthRegex);

        String damageRegex = "[+-]?\\d+\\.?\\d*";
        Pattern damagePattern = Pattern.compile(damageRegex);

        String damageSurpriseRegex = "[*/]";
        Pattern damageSurprisePattern = Pattern.compile(damageSurpriseRegex);

        List<String> demons = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            StringBuilder demon = new StringBuilder();

            Matcher healthMatcher = healthPattern.matcher(participant[i]);
            int health = 0;
            while (healthMatcher.find()) {
                int currentCharacter = healthMatcher.group().charAt(0);
                health += currentCharacter;
            }

            Matcher damageMatcher = damagePattern.matcher(participant[i]);
            double damage = 0;
            while (damageMatcher.find()) {
                double number = Double.parseDouble(damageMatcher.group());
                damage += number;
            }
            Matcher damageSurpriseMatcher = damageSurprisePattern.matcher(participant[i]);
            while (damageSurpriseMatcher.find()) {
                char symbol = damageSurpriseMatcher.group().charAt(0);
                if (symbol == '*') {
                    damage = damage * 2;
                } else {
                    damage = damage / 2;
                }
            }

            demon.append(participant[i]).append(" - ").append(health).append(" health, ").append(String.format("%.2f", damage)).append(" damage");
            demons.add(demon.toString());

        }

        for (String demon : demons) {
            System.out.println(demon);
        }

        sc.close();
    }

}
