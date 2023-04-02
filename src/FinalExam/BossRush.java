package FinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BossRush {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        String regex = "\\|(?<bossName>[A-Z]{4,})\\|:#(?<bossTitle>[A-Za-z]+ [A-Za-z]+)#";
        Pattern pattern = Pattern.compile(regex);

        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                System.out.println(matcher.group("bossName") + ", The " + matcher.group("bossTitle"));
                System.out.println(">> Strength: " + matcher.group("bossName").length());
                System.out.println(">> Armor: " + matcher.group("bossTitle").length());
            } else {
                System.out.println("Access denied!");
            }
        }

        sc.close();
    }

}
