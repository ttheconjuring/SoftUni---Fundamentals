package RegularExpressionsExercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        // [0-9A-Za-z]+[.\-_]?[0-9A-Za-z]+@[A-Za-z]+\-?[A-Za-z]+(\.[A-Za-z]+\-?[A-Za-z]+)+
        String regex = "(?<user>[0-9A-Za-z]+[.\\-_]?[0-9A-Za-z]+)@(?<host>([A-Za-z-]+\\.[A-Za-z]+)+[A-Za-z-.]*\\b)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }

        sc.close();
    }

}
