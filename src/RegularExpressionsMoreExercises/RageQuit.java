package RegularExpressionsMoreExercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RageQuit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine().trim().toUpperCase();

        String regex = "(?<string>\\D+)(?<number>\\d+)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        StringBuilder text = new StringBuilder();
        while (matcher.find()) {
            String string = matcher.group("string");
            int number = Integer.parseInt(matcher.group("number"));
            for (int i = 0; i < number; i++) {
                text.append(string);
            }
        }

        System.out.println("Unique symbols used: " + text.chars().distinct().count());
        System.out.println(text);

        sc.close();
    }

}
